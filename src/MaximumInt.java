import java.util.Arrays;

public class MaximumInt {
    public static void main(String[] args) {
        int[] A = new int[]{3, 2, -2, 5, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == 0) {
                    int number = Math.max(A[i], A[j]);
                    if (max < number) {
                        max = number;
                    }
                    j = A.length;
                }
            }
        }
        return max;
    }
}
