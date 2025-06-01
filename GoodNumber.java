public class GoodNumber {
    public static void main(String[] args) {
        System.out.println(count("3245",0));
        
    }
    static boolean result=true;
    static boolean count(String num,int index){
        if(index>=num.length()){
            return result;
        }
        int n=(int)num.charAt(index)-(int)'0';
        if((index%2!=0 && index!=0) && ((n%2==0 && n!=2) || n==9 || n==0)){
            return false;
        }
        else if((index%2==0||index==0) && n%2!=0){
            return false;
        }
        result=true&&count(num,index+1);
        return result;
    }
    
}
