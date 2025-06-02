
import java.util.Arrays;


public class BinaryStrings {

    static int[] arr=new int[3];

    public static void main(String[] args) {
        gb(3);
    }

    public static void gb(int n) {
        if (n<=0) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[n-1]=0;
        gb(n-1);
        arr[n-1]=1;
        gb(n-1);
    }
}
