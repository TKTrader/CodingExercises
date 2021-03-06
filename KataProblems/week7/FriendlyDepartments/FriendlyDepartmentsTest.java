package KataProblems.week7.FriendlyDepartments;

import KataProblems.week7.VertexNeighbors.Graph;
import KataProblems.week7.VertexNeighbors.Vertex;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FriendlyDepartmentsTest {
    Graph exampleGraph;
    Vertex[] V = new Vertex[]{new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex(), new Vertex()};

    @Before
    public void setUpSmallExampleGraph(){
        exampleGraph = new Graph();
        /*
         *      V[2] - V[0] - V[3] - V[4]    V[5]
         *              |       |
         *             V[1] - - -
         */
        exampleGraph.addEdges(V[0], V[1], V[0], V[2], V[0], V[3], V[1], V[3], V[3], V[4]);
        exampleGraph.addVertex(V[5]);
    }

    private Set<Vertex> createDepartment(Vertex... vertices){
        Set<Vertex> department = new HashSet<>();
        department.addAll(Arrays.asList(vertices));
        return department;
    }

    @Test
    public void exampleTests() {
        //Department of V[1] and V[2] is not connected to the department of V[4] and V[5]
        assertEquals(0, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(V[1], V[2]), createDepartment(V[4], V[5])));
    }

    @Test
    public void exampleTests2() {
        //Department of V[0], V[1] and V[2] is connected to the department of V[3] and V[4] 2 times: V[0]-V[3] and V[1]-V[3]
        assertEquals(2, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(V[0], V[1], V[2]), createDepartment(V[3], V[4])));
    }

    @Test
    public void exampleTests3(){
        //Department of V[1], V[2] and V[3] is connected to the department of V[0] 3 times: V[1]-V[0], V[2]-V[0] and V[3]-V[0]
        assertEquals(3, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(V[1], V[2], V[3]), createDepartment(V[0])));
    }

    @Test
    public void exampleTests4(){
        assertEquals(3, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(V[0]), createDepartment(V[1], V[2], V[3])));
    }

    @Test
    public void exampleTestsNull(){
        assertEquals(0, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(), createDepartment(V[0])));
    }

    @Test
    public void exampleTestsNull2(){
        assertEquals(0, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(V[1]), createDepartment()));
    }

    @Test
    public void exampleTestsIsolatedVertex(){
        assertEquals(0, FriendlyDepartments.departmentConnections(exampleGraph, createDepartment(V[1]), createDepartment(V[5])));
    }
}
