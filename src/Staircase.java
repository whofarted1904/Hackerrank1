public class Staircase {

    public static void main(String[] args) {
        staircase(6);
    }

    private static void staircase(int n) {
        for(int i = 1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
