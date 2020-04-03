public class ScientificTeam {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,5,7,9}));
    }
    public static int solution(int[]A){

        int count = 0;
        int firstPeriod = A[1]-A[0];
        if(A.length<3){
            return 0;
        }
        for(int i=0; i<A.length-1; i++){
                int period = A[i+1]-A[i];
                if (period==firstPeriod){
                    count++;
                }
            }

        return count;
    }

}
