import java.util.Stack;

public class MinStack {
    // Stores all the numbers pushed into the stack
    static Stack<Integer> primaryData = new Stack<>();

    //Stores the minimum values
    static Stack<Integer> minimumData = new Stack<>();
    public static void main(String[] args) {
        push(5);
        push(3);
        push(10);
        push(30);
        push(2);

        //Demonstrating that we can get the minimum in O(1) time
        System.out.println("Getmin : "+GetMin());
        System.out.println("Popped : "+pop());

    }
    public static void  push(int value){
        primaryData.push(value);
        if (minimumData.isEmpty() || value<=minimumData.peek()){
            minimumData.push(value);
        }
    }
    public static int pop() {
        if (primaryData.isEmpty()) {
            System.out.println("Stack is empty cannot pop.");
            return -1;
        }
        int popped = primaryData.pop();
        if (popped == minimumData.peek()) {
            minimumData.pop();
        }
        return popped;
    }
    public static Integer GetMin(){
        return minimumData.peek();
    }
    public static void display() {
        System.out.println("primaryData: " + primaryData);
        System.out.println("minimumData:  " + minimumData);
    }

}