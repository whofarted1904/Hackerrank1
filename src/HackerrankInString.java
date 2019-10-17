public class HackerrankInString {

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hackkkerank"));
    }
    public static String hackerrankInString(String s) {
        char[] hackerrank = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int index = 0;
        for (int i = 0; i < hackerrank.length; i++) {
            index = s.indexOf(hackerrank[i]);
            if (index<0){
                return "NO";
            }
            index++;

        }
        return "YES";

    }
}
