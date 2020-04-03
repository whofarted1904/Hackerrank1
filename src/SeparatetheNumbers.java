import java.lang.reflect.Array;

public class SeparatetheNumbers {
    public static void main(String[] args) {
        String s = "1234";
        separateNumbers(s);
    }

    static void separateNumbers(String s) {
        int n = s.length();
        String[] arr = s.split("");
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        boolean noOrder = false;
        for(int i=0; i<n-1; i++) {
            if (intArr[i + 1] != intArr[i] + 1) {
                noOrder = true;
            }
        }
            if(noOrder){
                System.out.println("NO");
            }else{
                System.out.println("YES" + " " + intArr[0]);
            }
        }
    }


