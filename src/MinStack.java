import java.util.Stack;

public class MinStack {
    // Primary storage and the tracking stack for minimum values
    static Stack<Integer> primaryStack = new Stack<>();
    static Stack<Integer> trackMinStack = new Stack<>();

    public static void main(String[] args) {
        push(5);
        push(3);
        push(10);
        push(30);
        push(2);

        // Outputting results directly
        System.out.println("Getmin : " + GetMin());
        System.out.println("Popped : " + pop());
        System.out.println("New Getmin : " + GetMin());
    }
