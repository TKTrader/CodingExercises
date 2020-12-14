package KataProblems.week7.ColleagueDistance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import KataProblems.week7.VertexNeighbors.Graph;
import KataProblems.week7.VertexNeighbors.Vertex;

public class ColleagueDistanceTest {

    Graph exampleGraph;
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @Before
    public void setUpSmallExampleGraph(){
        exampleGraph = new Graph();
        exampleGraph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        exampleGraph.addVertex(V[5]);
    }

    @Test
    public void testHopDistanceExample1() {
        assertEquals(1, ColleagueDistance.hopDistance(exampleGraph, V[0], V[1]));
    }

    @Test
    public void testHopDistanceExample2() {
        assertEquals(3, ColleagueDistance.hopDistance(exampleGraph, V[2], V[4]));
    }

    @Test
    public void testHopDistanceExample3(){
        assertEquals(3, ColleagueDistance.hopDistance(exampleGraph, V[4], V[2]));
    }
}
