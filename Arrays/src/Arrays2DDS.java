public class Arrays2DDS {

    static int hourglassSum(int[][] arr) {
        int max = -81;
        int k = 3;
        int n = arr.length;
        int[][] hourglass = new int[k][k];

        for (int i = 0; i < n - k + 1; i++) {
            for (int j = 0; j < n - k + 1; j++) {
                for (int l = 0; l < k; l++) {
                    for (int m = 0; m < k; m++) {
                        hourglass[l][m] = arr[l + i][m + j];
                    }
                }
                int sum = sum(hourglass);
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    private static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[0][i];
            sum += arr[2][i];

        }
        sum += arr[1][1];
        return sum;
    }
}
