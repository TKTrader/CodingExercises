package KataProblems.week7.IsConnected;

import KataProblems.week7.VertexNeighbors.Graph;
import KataProblems.week7.VertexNeighbors.Vertex;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsConnectedTest {
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @Test
    public void shouldReturnTrueForConnectedGraph(){
        Graph graph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]
         *              |       |
         *             V[1] - - -
         */
        graph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);

        assertTrue(IsConnected.isConnected(graph));
    }

    @Test
    public void shouldReturnFalseForGraphWithIsolatedVertex(){
        Graph graph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]    V[5]
         *              |       |
         *             V[1] - - -
         */
        graph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        graph.addVertex(V[5]);

        assertFalse(IsConnected.isConnected(graph));
    }

    @Test
    public void shouldReturnFalseForNotConnectedGraphWithoutIsolatedVertex(){
        Graph graph = new Graph();

        /*
         *      V[2] - V[0]      V[3] - V[4]
         *              |          |      |
         *             V[1]      V[5] - - -
         */
        graph.addEdges(V[0], V[1], V[0], V[2], V[3], V[4], V[4], V[5], V[3], V[5]);

        assertFalse(IsConnected.isConnected(graph));
    }

    @Test
    public void shouldReturnTrueForEmptyGraph(){
        assertTrue(IsConnected.isConnected(new Graph()));
    }
}
