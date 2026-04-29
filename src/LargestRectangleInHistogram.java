import java.util.Stack; // Import stack

public class LargestRectangleInHistogram { // Class definition
    public static void main(String[] args) { // Main method
        int[] inputHeights = {2, 1, 5, 6, 2, 3}; // Test data
        displayHistogram(inputHeights); // Print input
        displayResult(inputHeights, findLargestRectangle(inputHeights)); // Print result
    } // End main
