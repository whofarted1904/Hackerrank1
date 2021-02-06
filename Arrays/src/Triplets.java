import java.util.Arrays;
import java.util.HashSet;

public class Triplets {


    public static void main(String[] args) {
        findArrayTriplet(new int[]{1, -1, 0 }, 0);
        System.out.println("======================");
//        findArrayTriplet(new int[]{0, -4, 10, 4, 0, 22, 5, 3, 2, 1}, 2);
//        System.out.println("======================");

    }

    public static void findArrayTriplet(int[] arr, int sum) {
        System.out.println("Input array: " + Arrays.toString(arr));
        System.out.println("Triplet sum = " + sum);
        //System.out.println("Array triplets with sum " + sum + " are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(sum - arr[i] - arr[j])) {
                    //System.out.println("[" + arr[j] + ", " + arr[i] + ", " + (sum - arr[i] - arr[j]) + "]");
                    System.out.println("triplet with sum = " + sum + " is present");
                } else {
                    set.add(arr[j]);
                }

            }
        }
    }

}
