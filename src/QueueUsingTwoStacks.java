import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    // Two stacks: one for incoming data, one for outgoing data
    private Stack<T> input = new Stack<>();
    private Stack<T> output = new Stack<>();

    public static void main(String[] args) {
        // Create an instance of our queue for Integer
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();

        int[] ops = {10, 20, 30, -1, 40, -2, 50, -1, -1, 60, -1, -1};

        for (int op : ops) {
            if (op == -1) {
                System.out.println("Dequeued: " + queue.dequeue());
            } else if (op == -2) {
                System.out.println("Peeked: " + queue.peek());
            } else {
                queue.enqueue(op);
            }
            queue.displayStatus();
        }
    }

    // Adds an element to the back of the queue
    public void enqueue(T element) {
        input.push(element);
        System.out.println("Enqueued: " + element);
    }

    public T dequeue() {
        return (shiftStacks()) ? output.pop() : null;
    }

    // Returns the front element without removing it
    public T peek() {
        // Ensure data is in the 'output' stack, then peek at it
        return (shiftStacks()) ? output.peek() : null;
    }

    private boolean shiftStacks() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        // Return true if we have something in output to work with, false if queue is empty
        return !output.isEmpty();
    }

    // Helper to visualize how the elements sit in the two stacks
    public void displayStatus() {
        System.out.println("Input: " + input + " | Output: " + output);
    }
}