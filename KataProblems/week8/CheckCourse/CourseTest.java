package KataProblems.week8.CheckCourse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CourseTest {
    @Test
    public void BasicCourses() {
        char[][] map = new char[5][6];
        char[] line1 = {'0', '0', '0', '0', 'N', '0'};
        char[] line2 = {'0', '0', '0', '0', '0', '0'};
        char[] line3 = {'X', '0', '0', '0', '0', '0'};
        char[] line4 = {'0', '0', '0', '0', '0', '0'};
        char[] line5 = {'0', '0', '0', '0', '0', '0'};
        map[0] = line1;
        map[1] = line2;
        map[2] = line3;
        map[3] = line4;
        map[4] = line5;
        assertEquals(false, Course.checkCourse(map));
    }

    @Test
    public void BasicCourses2() {
        char[][] map2 = new char[5][6];
        char[] line11 = {'0','0','0','0','0','0'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'X','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        char[] line15 = {'0','0','N','0','0','0'};
        map2[0] = line11;
        map2[1] = line12;
        map2[2] = line13;
        map2[3] = line14;
        map2[4] = line15;
        assertEquals(false,Course.checkCourse(map2));
    }

    @Test
    public void BasicCourses3() {
        char[][] map3 = new char[5][6];
        char[] line11 = {'X','0','0','0','N','N'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'0','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        char[] line15 = {'N','N','N','0','0','0'};
        map3[0] = line11;
        map3[1] = line12;
        map3[2] = line13;
        map3[3] = line14;
        map3[4] = line15;
        assertEquals(false,Course.checkCourse(map3));
    }

    @Test
    public void BasicCourses4() {
        char[][] map4 = new char[4][6];
        char[] line11 = {'X','0','0','0','N','N'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'0','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        map4[0] = line11;
        map4[1] = line12;
        map4[2] = line13;
        map4[3] = line14;
        assertEquals(true,Course.checkCourse(map4));
    }

    @Test
    public void BasicCourses5() {
        char[][] map4 = new char[5][6];
        char[] line11 = {'0','0','0','0','N','N'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'0','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        char[] line15 = {'X','N','N','0','0','0'};
        map4[0] = line11;
        map4[1] = line12;
        map4[2] = line13;
        map4[3] = line14;
        map4[4] = line15;
        assertEquals(false,Course.checkCourse(map4));
    }

    @Test
    public void BasicCourses6() {
        char[][] map5 = new char[5][6];
        char[] line11 = {'0','0','0','0','N','N'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'0','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        char[] line15 = {'X','0','0','0','0','0'};
        map5[0] = line11;
        map5[1] = line12;
        map5[2] = line13;
        map5[3] = line14;
        map5[4] = line15;
        assertEquals(false,Course.checkCourse(map5));
    }

    @Test
    public void BasicCourses7() {
        char[][] map5 = new char[5][6];
        char[] line11 = {'0','0','0','0','0','N'};
        char[] line12 = {'0','0','0','0','0','0'};
        char[] line13 = {'0','0','0','0','0','0'};
        char[] line14 = {'0','0','0','0','0','0'};
        char[] line15 = {'X','0','0','0','0','0'};
        map5[0] = line11;
        map5[1] = line12;
        map5[2] = line13;
        map5[3] = line14;
        map5[4] = line15;
        assertEquals(false,Course.checkCourse(map5));
    }

//    @Test
//    public void FailedTest() {
//        char[][] map6 = new char[61][158];
////        Arrays.fill(map6,(char)'0');
//        char[] line1 = {
//                '0','0','0','0','0','0','0','0','N','0','0','0','0','0','0','0','0','0','N','0','0','0','0','0','0','0', //26
//                '0','0','0','0','0','0','0','N','0','0','0','0','0','0','0','N','0','0','0','0','0','0','0','0','0','0',
//                'N','N','0','0','0','0','0','0','0','0','0','N','0','N','0','0','0','0','0','0','0','N','0','0','N','0',
//                '0','0','0','0','0','0','N','0','0','0','0','0','0','0','0','0','0','0','0','0','0','N','0','0','0','0',
//                '0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0',
//                '0','0','0','0','0','0','N','0','0','0','N','0','0','0','0','0','0','0','0','0','0','0','0','0','0','N',
//                '0','0'};//158
//        map6[1][0] = 'X';
//        char[] line61 = {
//                '0','0','0','0','0','0','0','0','0','0','N','0','0','0','N','0','0','0','0','0','0','0','0','0', '0','0',
//                '0','0','0','N','0','0','0','0','0','0','N','0','N','0','0','0','0','N','N','0','0','0','0','0','0','0',
//                '0','0','0','0','N','0','0','0','0','0','0','0','0','0','0','0','0','0','0','N','0','0','0','0','0','0',
//                '0','0','0','N','0','0','0','N','0','0','N','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0',
//                '0','N','0','0','0','0','0','N','0','0','0','0','0','0','0','0','0','0','0','0','0','0','N','0','0','0',
//                '0','0', '0','0','0','0','0','0','0','0','0','0','N','0','0','0','0','0','0','0','0','0','0','0','0','0',
//                '0','0'};
//        map6[0]=line1;
//        map6[60]=line61;
//        assertEquals(false,Course.checkCourse(map6));
//    }
}
