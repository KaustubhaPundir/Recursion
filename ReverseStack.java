
import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(2);
        System.out.println(s);
        Reverse(s);
        System.out.println(s);
    }

    public static void Reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        Reverse(s);
        insertAtLast(s, temp);

    }

    public static void insertAtLast(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }
        int topElement = s.pop();
        insertAtLast(s, element);
        s.push(topElement);
    }
}
