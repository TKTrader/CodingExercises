package KataProblems.week7.IsConnected;

import KataProblems.week7.VertexNeighbors.Edge;
import KataProblems.week7.VertexNeighbors.Graph;
import KataProblems.week7.VertexNeighbors.Vertex;

import java.util.*;

public class IsConnected {
    public static boolean isConnected(Graph graph){
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> vtxSet = graph.getVertices();
        if (vtxSet.isEmpty()){ return true;}
        Map<Vertex, Set<Vertex>> vertexMap = getNeighbours(graph);
        Vertex root = vtxSet.iterator().next();
        queue.add(root);
        while (!queue.isEmpty()){
            Vertex vtx = queue.poll();
            Set<Vertex> nbrs = vertexMap.get(vtx);
            visited.add(vtx);
            if (nbrs!=null){
                for (Vertex v : nbrs){
                    if (!queue.contains(v) && !visited.contains(v)){
                        queue.add(v);
                    }
                }
            }
        }
        return vtxSet.size()==visited.size();
    }

    public static Map<Vertex, Set<Vertex>> getNeighbours(Graph graph){
        Map<Vertex, Set<Vertex>> vertexMap = new HashMap<>();
        for (Edge edge : graph.getEdges()){
            if (vertexMap.get(edge.getV1())==null){
                vertexMap.computeIfAbsent(edge.getV1(), v -> new HashSet<>()).add(edge.getV2());
            } else if (!vertexMap.get(edge.getV1()).contains(edge.getV2())){
                Set<Vertex> vertexSet = vertexMap.get(edge.getV1());
                vertexSet.add(edge.getV2());
            }
            if (vertexMap.get(edge.getV2())==null){
                vertexMap.computeIfAbsent(edge.getV2(), v -> new HashSet<>()).add(edge.getV1());
            } else if (!vertexMap.get(edge.getV2()).contains(edge.getV1())){
                Set<Vertex> vertexSet2 = vertexMap.get(edge.getV2());
                vertexSet2.add(edge.getV1());
            }
        }
        for (Vertex v : graph.getVertices()){
            if(!vertexMap.containsKey(v)){
                Set<Vertex> set = new HashSet<>();
                vertexMap.put(v,set);
            }
        }
        for (Map.Entry<Vertex, Set<Vertex>> e : vertexMap.entrySet()) {
//            System.out.println(e.getKey() + ":" + vertexMap.get(e.getKey()));
        }
        return vertexMap;
    }
}
