package KataProblems.week7.FriendlyDepartments;

import KataProblems.week7.VertexNeighbors.Edge;
import KataProblems.week7.VertexNeighbors.Graph;
import KataProblems.week7.VertexNeighbors.Vertex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FriendlyDepartments {

    public static int departmentConnections(Graph graph, Set<Vertex> department1, Set<Vertex> department2){
        Map<Vertex, Set<Vertex>> vertexSetMap = getNeighbours(graph);
        int edgeCount = 0;
        if (department1==null || department2==null) { return edgeCount;}
        for (Vertex vtx1 : department1){
            Set<Vertex> vtxSet = vertexSetMap.get(vtx1);
            if (vtxSet!=null){
                for (Vertex vtx2 : department2){
                    if (vtxSet.contains(vtx2)){
                        edgeCount++;
                    }
                }
            }
        }
        return edgeCount;
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
//        for (Map.Entry<Vertex, Set<Vertex>> e : vertexMap.entrySet()) {
//            System.out.println(e.getKey() + ":" + vertexMap.get(e.getKey()));
//        }
        return vertexMap;
    }
}
