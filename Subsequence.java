public class Subsequence {
    static int nextindex=0;
    public static void main(String[] args) {
        genSubsequence("abc",0, nextindex);
    }

    public static void genSubsequence(String str,int startindex,int nextindex){
        if(nextindex==str.length() && startindex!=str.length()){
            startindex++;
            nextindex=startindex;
        }
        if (startindex>=str.length()){
            return;
        }
        if(startindex==0 && nextindex==0){
            System.out.println(" ");
        }
        System.out.println(str.substring(startindex, nextindex+1));
        genSubsequence(str, startindex,nextindex+1);

    }
}
