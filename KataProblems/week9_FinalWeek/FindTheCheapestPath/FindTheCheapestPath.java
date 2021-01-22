package KataProblems.week9_FinalWeek.FindTheCheapestPath;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.awt.Point;
import java.util.Set;

public class FindTheCheapestPath {

    static List<String> solution;
    static int solutionCost;
    // INCOMPLETE
    // First draft, needs debugging, etc
    // logic issue in terms of path stopping at final node and recursion
    static List<String> cheapestPath(int[][] t, Point start, Point finish) {
        solutionCost=Integer.MAX_VALUE;
        for (int[] row : t){
            for (int elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        System.out.println("start:  " + start.x + "," + start.y);
        System.out.println("finish: " + finish.x + "," + finish.y);
        Set<Point> visited = new HashSet<>();
        visited.add(start);
        int pathCost = 0;
        List<String> path = new ArrayList<String>();
        visitAdjacentCells(visited, pathCost, start, finish, t, path);

        return solution;
    }

    public static void visitAdjacentCells(Set<Point> visited, int pathCost, Point position, Point finish, int[][] graph, List<String> path){
        visited.add(position);
        pathCost += graph[(int) position.getX()][(int) position.getY()];
        int x = (int) position.getX();
        int y = (int) position.getY();

        if (position.equals(finish)){
            if (pathCost<solutionCost){
                solution = path;
                solutionCost = pathCost;
            }
            return;
        }
        // check Up
        Point positionUp = new Point(x-1,y);
        if (position.x>0 && !visited.contains(positionUp) && pathCost<solutionCost){
            System.out.println("checking " +positionUp.toString());
            path.add("up");
            visitAdjacentCells(visited, pathCost, positionUp, finish, graph, path);
        }
        // check Down
        Point positionDown = new Point(x+1,y);
        if (position.x<graph[0].length-1 && !visited.contains(positionDown) && pathCost<solutionCost){
            System.out.println("checking " +positionDown.toString());
            path.add("down");
            visitAdjacentCells(visited, pathCost, positionDown, finish, graph, path);
        }
        // check Right
        Point positionRight = new Point(x,y+1);
        if (position.y<graph.length-1 && !visited.contains(positionRight) && pathCost<solutionCost){
            System.out.println("checking " +positionRight.toString());
            path.add("right");
            visitAdjacentCells(visited, pathCost, positionRight, finish, graph, path);
        }
        // check Left
        Point positionLeft = new Point(x,y-1);
        if (position.y>0 && !visited.contains(positionLeft) && pathCost<solutionCost){
            System.out.println("checking " +positionLeft.toString());
            path.add("left");
            visitAdjacentCells(visited, pathCost, positionLeft, finish, graph, path);
        }
        return;
    }
}
