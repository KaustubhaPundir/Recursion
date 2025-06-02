import java.util.Stack;

public class GenParanthesis {

    static Stack<String> s = new Stack<String>();
    static int open = 0;
    static int close = 0;
    static int bits=3;

    public static void main(String[] args) {
        generate(open, close);
    }

    static void generate(int open, int close) {
        if ((open == close && open == bits)) {
            System.out.println(s.toString());
            return;
        }
        if (open < bits) {
            s.push("(");
            generate(open + 1, close);
            s.pop();
        }
        if (open > close) {
            s.push(")");
            generate(open, close + 1);
            s.pop();
        }

    }
}
