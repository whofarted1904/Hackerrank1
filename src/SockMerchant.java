import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

    private static int[] arr = {2, 2, 4, 5, 3, 5, 1, 3, 3, 3};
    private static int n = arr.length;

    public static void main(String[] args) {

        System.out.println(sockMerchant(n, arr));
    }

    public static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Set<Integer> socksSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!socksSet.contains(ar[i])) {
                socksSet.add(ar[i]);
            } else {
                pairs++;
                socksSet.remove(ar[i]);
            }
        }
        return pairs;
    }
}
