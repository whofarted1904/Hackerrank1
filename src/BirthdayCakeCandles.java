import java.util.Arrays;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        findCandles(new int[] {4,4,3,2,1,5,7,7,7});
    }

    private static void findCandles(int[] ar) {

        Arrays.sort(ar);
        int max = ar[ar.length-1];
        int maxCount=0;
        for(int i=ar.length-1; i>=0; i--){
            if (ar[i]==max){
                maxCount++;
            }
        }
        System.out.println(maxCount);
    }
}
