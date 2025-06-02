s
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(2);
        System.out.println(s);
        sortedStack(s);
        System.out.println(s);
        

    }
    public static Stack<Integer> sortedStack(Stack<Integer> s){
        if (s.isEmpty() || s.size()==1){
            return s;
        }
        int top=s.pop();
        sortedStack(s);
        insertStack(top,s);
        return s;
    }   
    
    public static void insertStack(int element,Stack <Integer>s){
        if (s.isEmpty() || s.peek()<=element){
            s.push(element);
            return;
        }
        int top=s.pop();
        insertStack(element, s);
        s.push(top);
    }
    
}
