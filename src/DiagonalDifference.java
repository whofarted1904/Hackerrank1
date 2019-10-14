import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum = 0;
        int leftDiameter = 0;
        int rightDiameter = 0;
        for(int i=0; i<arr.size(); i++){
            leftDiameter += arr.get(i).get(i);
            rightDiameter += arr.get(i).get((arr.size()-(i+1)));
        }
        return Math.abs(leftDiameter-rightDiameter);
    }
}
