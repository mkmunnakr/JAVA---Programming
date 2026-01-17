import java.util.Stack;
public class redundantStackProblem {
    public static boolean hasRedundantParentheses(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == ')') {
                    char top = stack.pop();
                    boolean operatorFound = false;

                    // Pop until '('
                    while (top != '(') {
                        if (top == '+' || top == '-' || top == '*' || top == '/') {
                            operatorFound = true;
                        }
                        top = stack.pop();
                    }

                    // If no operator inside brackets → redundant
                    if (!operatorFound) {
                        return true;
                    }
                } else {
                    stack.push(ch);
                }
            }
            return false;
        }

        // 🔎 Example Usage
        public static void main(String[] args) {
            String[] expressions = {"(a+b)", "((a+b))", "(a)", "(a+(b)/c)", "((a))"};

            for (String exp : expressions) {
                System.out.println(exp + " → " +
                        (hasRedundantParentheses(exp) ? "Contains redundant parentheses" : "No redundancy"));
            }
        }

}
