package KataProblems.week2.GrowthOfAPopulation;

public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // P(0) = 1000
        // r = .02
        // P(n) = P(n-1)*1.02 + 50

        int years = 0;
        double population = (double) p0;
        while (population < p){
            population = population*(1+percent*.01) + aug;
            years++;
        }
        return years;
    }
}
