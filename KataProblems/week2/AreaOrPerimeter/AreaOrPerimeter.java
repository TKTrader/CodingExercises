package KataProblems.week2.AreaOrPerimeter;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        if (l==w){
            return l*w;
        } else {
            return 2*l + 2*w;
        }
    }
}
