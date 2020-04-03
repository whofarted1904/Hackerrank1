import java.util.ArrayList;
import java.util.List;

public class ShiningBulbs {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 4, 1, 5}));

    }

    public static int solution(int[] arr) {
        int number = 0;
        List<Integer> turnedLamps = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            turnedLamps.add(arr[i]);
            boolean isShining = true;
            for (int j = 0; j < turnedLamps.size(); j++) {
                if (!turnedLamps.contains(j + 1)) {
                    isShining = false;
                }
            }
            if (isShining) {
                number++;
            }
        }
        return number;
    }
}
