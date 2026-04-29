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

            // Move elements back to inputStack if they are larger than the current element
            while (!auxiliaryStack.isEmpty() && auxiliaryStack.peek() > elementToPlace) {
                inputStack.push(auxiliaryStack.pop());
            }
            auxiliaryStack.push(elementToPlace);
        }
        // Transfer from auxiliary back to original to get the requested order
        while (!auxiliaryStack.isEmpty()) {
            inputStack.push(auxiliaryStack.pop());
        }
    }
    public static void sortStackRecursive(Stack<Integer> targetStack) {
        if (targetStack.isEmpty())
            return;
        int poppedElement = targetStack.pop();
        sortStackRecursive(targetStack);
        insertInSortedOrder(targetStack, poppedElement);
    }

    private static void insertInSortedOrder(Stack<Integer> targetStack, int elementToInsert) {
        if (targetStack.isEmpty() || elementToInsert >= targetStack.peek()) {
            targetStack.push(elementToInsert);
            return;
        }
        int tempVal = targetStack.pop();
        insertInSortedOrder(targetStack, elementToInsert);
        targetStack.push(tempVal);
    }
}
