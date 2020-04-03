import java.util.ArrayList;
import java.util.List;

public class ForgottenNecklases {
    public static void main(String[] args) {

    }

    public static int solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int index = 0;

        while (true) {
            int count = 1;
            list.add(index);
            for (int i = index; arr[i] != index; i = arr[i]) {
                count++;
                list.add(arr[i]);
            }
            if (count > max) {
                max = count;
            }
            if (list.size() == arr.length) {
                return max;
            }
            for (int i = 0; i < arr.length; i++) {
                if (!list.contains(i)) {
                    index = i;
                    i = arr.length;
                }
            }

        }


    }
}
