public class Kangaroo {
    public static void main(String[] args) {
        System.out.println(kangarooJump(0, 3, 4, 3));
    }

    private static String kangarooJump(int x1, int v1, int x2, int v2) {

        if (v1 > v2 && ((x2 - x1) % (v1 - v2)) == 0)
            return "YES";
        else
            return "NO";

    }
}
