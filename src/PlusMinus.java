import sun.tools.tree.NewArrayExpression;

import java.lang.reflect.Array;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {134, 21, 0, -1, -12, 24, 69, 22};
        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double positive=0, negative = 0, zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else if (arr[i] == 0) {
                zeros++;
            }
        }

        System.out.printf("%.06f%n%.06f%n%.06f",  positive / arr.length,negative / arr.length,zeros / arr.length);
    }

}
