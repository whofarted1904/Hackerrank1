import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(30);
        System.out.println(compareTriplets(a, b));


    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> comparison = new ArrayList<>();

//        int pointsAlice = ((a.get(0) > b.get(0))?1:0)+ ((a.get(1) > b.get(1))?1:0)+ ((a.get(2) > b.get(2))?1:0) ;
//        int pointsBob = ((a.get(0) < b.get(0))?1:0)+ ((a.get(1) < b.get(1))?1:0)+ ((a.get(2) < b.get(2))?1:0) ;
//
        int scoreA = 0;
        int scoreB = 0;

        if (a.get(0) > b.get(0)) {
            scoreA++;
        }
        if (a.get(0) < b.get(0)) {
            scoreB++;
        }
        if (a.get(1) > b.get(1)) {
            scoreA++;
        }
        if (a.get(1) < b.get(1)) {
            scoreB++;
        }
        if (a.get(2) > b.get(2)) {
            scoreA++;
        }
        if (a.get(2) < b.get(2)) {
            scoreB++;
        }
        comparison.add(scoreA);
        comparison.add(scoreB);


        return comparison;
    }

}
