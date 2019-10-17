public class Pangram {

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    static String pangrams(String s) {
        if (s.length() < 26) {
            return "not pangram";
        }
        s = s.toLowerCase();
        String abc = "abcdefghigklmnopqrstuvwxyz";
        char[] arr = abc.toCharArray();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            index = s.indexOf(arr[i]);
            if (index < 0) {
                return "not pangram";
            }
        }
        return "pangram";
    }


}
