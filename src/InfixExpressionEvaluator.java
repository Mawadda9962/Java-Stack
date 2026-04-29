import java.util.Stack;

public class InfixExpressionEvaluator {

    // operandList stores the numbers, symbolStack stores operators and parentheses
    static Stack<Double>    operandList  = new Stack<>();
    static Stack<Character> symbolStack = new Stack<>();

    public static void main(String[] args) {

        System.out.println(evaluate("10 % 3"));
        System.out.println(evaluate("3.5 * 2 + 1.5"));
        System.out.println(evaluate("(2 + 3) * (4 - 1)"));
        System.out.println(evaluate("10 / 0"));
        System.out.println(evaluate("-5 + 3"));
        System.out.println(evaluate("(-5 + 3) * 2"));
        System.out.println(evaluate("((2 + 3) * 4) / 2"));
    }

    public static String evaluate(String mathExpr) {
        // Clear stacks for fresh evaluation
        operandList.clear();
        symbolStack.clear();

        for (int idx = 0; idx < mathExpr.length(); idx++) {
            char currentToken = mathExpr.charAt(idx);

            if (currentToken == ' ') continue;

            // Number logic: builds multi-digit and decimal numbers
            if (Character.isDigit(currentToken) || currentToken == '.') {
                StringBuilder numericBuilder = new StringBuilder();
                while (idx < mathExpr.length() && (Character.isDigit(mathExpr.charAt(idx)) || mathExpr.charAt(idx) == '.')) {
                    numericBuilder.append(mathExpr.charAt(idx));
                    idx++;
                }
                idx--;
                operandList.push(Double.parseDouble(numericBuilder.toString()));
            }

            // Push opening parenthesis to symbolStack
            else if (currentToken == '(') {
                symbolStack.push(currentToken);
            }

            // Closing parenthesis: solve everything inside until '(' is found
            else if (currentToken == ')') {
                while (symbolStack.peek() != '(') {
                    double secondVal = operandList.pop();
                    double firstVal  = operandList.pop();
                    char   activeOp  = symbolStack.pop();
                    operandList.push(compute(firstVal, secondVal, activeOp));
                }
                symbolStack.pop();
            }

            // Unary minus logic: handles negative numbers at start or after '('
            else if (currentToken == '-' && (idx == 0 || mathExpr.charAt(idx - 1) == '(')) {
                operandList.push(0.0);
                symbolStack.push('-');
            }

            // Operator logic: apply existing operators if they have higher or equal precedence
            else if (currentToken == '+' || currentToken == '-' || currentToken == '*' || currentToken == '/' || currentToken == '^' || currentToken == '%') {
                while (!symbolStack.isEmpty()
                        && symbolStack.peek() != '('
                        && checkPrecedence(symbolStack.peek()) >= checkPrecedence(currentToken)) {
                    double secondVal = operandList.pop();
                    double firstVal  = operandList.pop();
                    char   activeOp  = symbolStack.pop();
                    operandList.push(compute(firstVal, secondVal, activeOp));
                }
                symbolStack.push(currentToken);
            }
        }

        // Finalize calculations for remaining items in the stacks
        while (!symbolStack.isEmpty()) {
            double secondVal = operandList.pop();
            double firstVal  = operandList.pop();
            char   activeOp  = symbolStack.pop();
            operandList.push(compute(firstVal, secondVal, activeOp));
        }

        return String.valueOf(operandList.pop());
    }

    // Performs the actual math calculation based on the operator
    public static double compute(double firstVal, double secondVal, char activeOp) {
        double calcResult = 0;

        switch (activeOp) {
            case '+':
                calcResult = firstVal + secondVal;
                break;
            case '-':
                calcResult = firstVal - secondVal;
                break;
            case '*':
                calcResult = firstVal * secondVal;
                break;
            case '/':
                if (secondVal == 0) {
                    System.out.println("ERROR: Division by zero!");
                    calcResult = 0;
                } else {
                    calcResult = firstVal / secondVal;
                }
                break;
            case '^':
                calcResult = Math.pow(firstVal, secondVal);
                break;
            case '%':
                calcResult = firstVal % secondVal;
                break;
            default:
                calcResult = 0;
        }

        return calcResult;
    }

    // Defines the order of operations (BODMAS/PEMDAS)
    public static int checkPrecedence(char activeOp) {
        int priorityVal = 0;

        if (activeOp == '+' || activeOp == '-') {
            priorityVal = 1;
        } else if (activeOp == '*' || activeOp == '/' || activeOp == '%') {
            priorityVal = 2;
        } else if (activeOp == '^') {
            priorityVal = 3;
        } else {
            priorityVal = 0;
        }

        return priorityVal;
    }
}