import java.util.Stack;

public class Exercise3_StackReversal {

    // Reverses the stack using only stack operations
    public static void reverse(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    // Helper method to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Integer> stack, int value) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }

    // Test method
    public static void test() {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Before: " + stack);

        reverse(stack);

        System.out.println("After:  " + stack);
    }
}
