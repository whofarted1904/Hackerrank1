public class CountingValleys {

    private static String string = "UDDDUDUUUUUUDDDDDDDDDDDUUU";
    private static int n = string.length();

    public static void main(String[] args) {
        System.out.println(countingValleys(n, string));
    }

    private static int countingValleys(int n, String string) {
        int valleys = 0;
        int level = 0;
        char[] arr = string.toCharArray();
        for (char c : arr) {
            if (c == 'U') {
                level++;
            }
            if (c == 'D') {
                level--;
            }
            if (level == 0 && c == 'U') {
                valleys++;
            }

        }
        return valleys;
    }

}
