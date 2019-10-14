import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        miniMaxSum(arr);
    }

    private static void miniMaxSum(int[] arr) {
        long maxSum = 0;
        long minSum = 0;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            maxSum += arr[i];
        }

        for (int i=0; i<arr.length-1; i++){
            minSum += arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }
}
