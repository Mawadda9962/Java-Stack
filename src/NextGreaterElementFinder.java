import java.util.Stack;

public class NextGreaterElementFinder {

    public static void main(String[] args) {

        int[] arr = {13, 7, 6, 12};
        int[] result = nextGreater(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " → " + result[i]);
        }
    }

    // Simple Next Greater function
    public static int[] nextGreater(int[] arr) {

        int[] result = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        // initialize all as -1
        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {

            // check if current element is greater
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }

            stack.push(i);
        }

        return result;
    }
}