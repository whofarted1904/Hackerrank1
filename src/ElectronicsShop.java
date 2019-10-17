public class ElectronicsShop {
    public static void main(String[] args) {
        int b = 60;
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int sum = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if ((keyboards[i] + drives[j] <= b) && keyboards[i] + drives[j] > sum) {
                    sum = keyboards[i] + drives[j];
                }
            }
        }
        return sum;
    }
}
