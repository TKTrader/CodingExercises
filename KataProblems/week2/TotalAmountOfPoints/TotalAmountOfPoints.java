package KataProblems.week2.TotalAmountOfPoints;

public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int total = 0;
        for (String game : games) {
            int x = Character.getNumericValue(game.charAt(0));
            int y = Character.getNumericValue(game.charAt(2));
            total += countPoints(x,y);
        }
        return total;
    }

    public static int countPoints(int x, int y){
        if (x>y){
            return 3;
        } else if (x<y) {
            return 0;
        } else {
            return 1;
        }
    }
}
