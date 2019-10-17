import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WeightedUniformStrings {
    public static void main(String[] args) {

    }

    static String[] weightedUniformStrings(String s, int[] queries) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] str = s.toCharArray();
        char[] abcarr = abc.toCharArray();
        String[] strings = new String[queries.length];
        Set<Integer> set = new HashSet<>();
        int index = -1;
       for (int i=0; i<str.length; i++){
           index = Arrays.binarySearch(abcarr, str[i])+1;
           set.add(index);
           int indexAdd = -1;
           int k=2;

           while(i<str.length-1 && str[i] == str[i+1]){
               indexAdd = index*k;
               set.add(indexAdd);
               k++;
               i++;
           }
       }
       for(int i=0; i<queries.length; i++){
           if(set.contains(queries[i])){
               strings[i] = "Yes";
           }else{
               strings[i] = "No";
           }
       }
        return strings;

    }
}
