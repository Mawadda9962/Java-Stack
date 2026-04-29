import java.util.Stack; // Import stack

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] inputHeights = {2, 1, 5, 6, 2, 3};

        System.out.println("Heights: " + java.util.Arrays.toString(inputHeights)); // Print input
        int result = findLargestRectangle(inputHeights);
        System.out.println("Max Area: " + result); // Print result
    }
    public static int findLargestRectangle(int[] barHeights) { // Logic method
        Stack<Integer> indexStack = new Stack<>(); // Store indices
        int peakArea = 0; // Area tracker

        if (barHeights.length == 0) return 0; // Empty check

        for (int cursor = 0; cursor <= barHeights.length; cursor++) { // Process bars
            int currentVal = (cursor == barHeights.length) ? 0 : barHeights[cursor]; // Current height

            while (!indexStack.isEmpty() && currentVal < barHeights[indexStack.peek()]) { // Height decrease
                int h = barHeights[indexStack.pop()]; // Pop height
                int width = indexStack.isEmpty() ? cursor : cursor - indexStack.peek() - 1; // Find width
                int currentArea  = h * width; // Get area

                if (currentArea > peakArea) peakArea = currentArea; // Update max
            }
            indexStack.push(cursor); // Save index
        }
        return peakArea; // Return max
    }

