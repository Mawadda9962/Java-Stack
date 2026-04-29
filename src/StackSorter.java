import java.util.Stack;
public class StackSorter  {
    public static void main(String[] args){

        Stack<Integer> originalStack = new Stack<>();

        originalStack.push(3);
        originalStack.push(2);
        originalStack.push(4);
        originalStack.push(1);
        originalStack.push(5);

        System.out.println("Before : " + originalStack);

        sortStack(originalStack);

        System.out.println("After  : " + originalStack);
        System.out.println();
    }

    public static void sortStack(Stack<Integer> inputStack) {
        Stack<Integer> auxiliaryStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            int elementToPlace = inputStack.pop();

}
