import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MonkeyOnTheRiver {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, -1, 0, 2, 3, 5}, 3));
    }

    public static int solution(int[] arr, int d) {
//        HashSet set = new HashSet();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= d) {
//                set.add(arr[i]);
//            }
//            if (set.size() == d) {
//                return i;
//            }
//        }
//        return -1;
//    }
        Map<Integer, Boolean> m = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == null) {
                m.put(arr[i], true);
                count++;
            }

            if (count == d || d == arr.length) {
                return i;
            }
        }

        return -1;
    }
}
