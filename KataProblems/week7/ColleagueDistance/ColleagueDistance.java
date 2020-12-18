package KataProblems.week7.ColleagueDistance;

import KataProblems.week7.VertexNeighbors.Edge;
import KataProblems.week7.VertexNeighbors.Graph;
import KataProblems.week7.VertexNeighbors.Vertex;

import java.util.*;

public class ColleagueDistance {

    public static int hopDistance(Graph graph, Vertex source, Vertex target){
        if (!graph.getVertices().contains(source) || !graph.getVertices().contains(target)){
            return -1;
        }
        Set<Vertex> visitedVertices = new HashSet<Vertex>();
        LinkedList<Vertex> queue = new LinkedList<>();
        Map<Vertex, Integer> distanceMap = new HashMap<>();

        for (Vertex v : graph.getVertices()) {
            distanceMap.put(v, Integer.MAX_VALUE);
        };

        Map<Vertex, Set<Vertex>> neighbourMap = getNeighbours(graph);

        queue.add(source);
        distanceMap.put(source, 0);

        while(!queue.isEmpty()){
            Vertex predecessor = queue.get(0);
            visitedVertices.add(predecessor);
            Set<Vertex> neighbors = neighbourMap.get(predecessor);
            queue.remove(0);
            for (Vertex neighbor : neighbors) {
                if (distanceMap.get(predecessor)+1<distanceMap.get(neighbor)){
                    distanceMap.replace(neighbor, distanceMap.get(predecessor)+1);
                }
                if (!visitedVertices.contains(neighbor) && !queue.contains(neighbor)) {
                    queue.addLast(neighbor);
                }
            }
        }
        if (distanceMap.containsKey(target)){
            return distanceMap.get(target);
        } else {
            return -1;
        }
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
