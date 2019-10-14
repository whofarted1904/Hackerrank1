public class DrawingBook {

    public static void main(String[] args) {
        System.out.println(pageCount(99, 94));

    }

    public static int pageCount(int n, int p) {
//
//        int pageCountFront = 0;
//        int pageCountBack = 0;
//        for (int i = 2; i < p; i = i + 2) {
//            pageCountFront++;
//        }
//        for (int i = n - 1; i < p; i = i - 2) {
//            pageCountBack++;
//        }
//
//        return Math.min(pageCountFront, pageCountBack);
        return Math.min(p/2, n/2-p/2);
    }

}
