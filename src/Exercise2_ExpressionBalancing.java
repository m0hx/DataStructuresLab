public class Exercise2_ExpressionBalancing {

    public static boolean isBalanced(String exp) {

        SingleArrayStack stack = new SingleArrayStack(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing bracket, check match
            else if (ch == ')' || ch == '}' || ch == ']') {

                // No opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if (!isMatchingPair(open, ch)) {
                    return false;
                }
            }
        }

        // If stack is empty, expression is balanced
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Test method
    public static void test() {

        String exp1 = "{[()]}";
        String exp2 = "{[(])}";
        String exp3 = "((()))";
        String exp4 = "({[})";

        System.out.println(exp1 + " -> " + isBalanced(exp1));
        System.out.println(exp2 + " -> " + isBalanced(exp2));
        System.out.println(exp3 + " -> " + isBalanced(exp3));
        System.out.println(exp4 + " -> " + isBalanced(exp4));
    }
}
