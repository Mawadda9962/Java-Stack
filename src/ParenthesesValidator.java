import java.util.Stack;

public class ParenthesesValidator {
    public static void main(String[] args) {
        // Store inputs in an array for easy iteration
        String[] testCases = {"()}}", "[(Hi)}}]", "{Java :){}", "{{()}}"};

        // Loop through each case to keep the main method concise
        for (String inputStr : testCases) {
            System.out.println(inputStr + " Is balanced? " + isBalanced(inputStr));
        }
    }

    public static Boolean isBalanced(String inputStr) {
        Stack<Character> charStack = new Stack<>(); // Internal stack
        System.out.println("Validating " + inputStr); // Status message

        if (inputStr.isEmpty()) { // Empty check
            System.out.println("Empty String");
            return true;
        }

        for (int idx = 0; idx < inputStr.length(); idx++) {
            char currentSymbol = inputStr.charAt(idx); // Current character

            if (currentSymbol == '(' || currentSymbol == '[' || currentSymbol == '{') {
                charStack.push(currentSymbol); // Push opener
                System.out.println("  PUSH  '" + currentSymbol + "'  → stack: " + charStack);
            }
            else if (currentSymbol == ')' || currentSymbol == ']' || currentSymbol == '}') {
                if (charStack.isEmpty()) { // Underflow check
                    System.out.println("  CLOSE '" + currentSymbol + "'  → stack empty.");
                    return false; // Not balanced
                }

                char removedChar = charStack.pop(); // Pop opener
                boolean isMatch = (currentSymbol == ')' && removedChar == '(')
                        || (currentSymbol == ']' && removedChar == '[')
                        || (currentSymbol == '}' && removedChar == '{');

                if (isMatch) { // Correct pair
                    System.out.println("  POP   '" + removedChar + "' matched with '" + currentSymbol + "'  → stack: " + charStack);
                } else { // Wrong pair
                    System.out.println("  MISMATCH: '" + removedChar + "' does NOT match '" + currentSymbol + "'  → unbalanced!");
                    return false; // Exit early
                }
            } else { // Non-brackets
                System.out.println("  SKIP  '" + currentSymbol + "'  not a bracket");
            }
        }

        if (!charStack.isEmpty()) { // Final check
            System.out.println("  Stack NOT empty at end: " + charStack + " → unclosed openers!");
            return false;
        }
        return true;
    }
}