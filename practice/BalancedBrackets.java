import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String expression1 = "[()]{}{[()()]()}"; // Balanced
        String expression2 = "[(]";             // Not balanced

        if (isBalanced(expression1)) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }

        if (isBalanced(expression2)) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }

    public static boolean isBalanced(String expression) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the expression
        for (char c : expression.toCharArray()) {
            // Push opening brackets into the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If closing bracket appears, check if the top of the stack matches
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        // If stack is empty, brackets are balanced
        return stack.isEmpty();
    }

    // Function to check if the brackets form a matching pair
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
 
