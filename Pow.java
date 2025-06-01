public class Pow {
    public static void main(String[] args) {
        System.out.println(getPow(5, 2-1, 5));

    }
    static int getPow(int x,int n,int result){
        if (n==0){
            return result;
        }
        result=result*x;
        return getPow(x, n-1, result);
    }
}
