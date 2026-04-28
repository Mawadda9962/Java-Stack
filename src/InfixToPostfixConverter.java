import java.util.Stack;

public class InfixToPostfixConverter {

    // stack for numbers
    static Stack<Double> numbers = new Stack<>();

    // stack for operators
    static Stack<Character> operators = new Stack<>();

    public static void main(String[] args) {

        System.out.println(evaluate("3 + 4 * 2"));
        System.out.println(evaluate("(2 + 3) * 4"));
        System.out.println(evaluate("10 + 2 * 6"));
        System.out.println(evaluate("100 / (2 + 3)"));
    }

    public static String evaluate(String expression) {

        // clear stacks
        numbers.clear();
        operators.clear();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // ignore spaces
            if (ch == ' ') continue;

            // number handling (multi-digit + decimals)
            if (Character.isDigit(ch) || ch == '.') {

                StringBuilder num = new StringBuilder();

                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {

                    num.append(expression.charAt(i));
                    i++;
                }

                i--;

                numbers.push(Double.parseDouble(num.toString()));
            }

            // open bracket
            else if (ch == '(') {
                operators.push(ch);
            }

            // close bracket
            else if (ch == ')') {

                while (!operators.isEmpty() && operators.peek() != '(') {

                    double b = numbers.pop();
                    double a = numbers.pop();
                    char op = operators.pop();

                    numbers.push(compute(a, b, op));
                }

                operators.pop(); // remove '('
            }

            // unary minus
            else if (ch == '-' && (i == 0 || expression.charAt(i - 1) == '(')) {
                numbers.push(0.0);
                operators.push('-');
            }

            // operator handling
            else if (isOperator(ch)) {

                while (!operators.isEmpty()
                        && precedence(operators.peek()) >= precedence(ch)) {

                    double b = numbers.pop();
                    double a = numbers.pop();
                    char op = operators.pop();

                    numbers.push(compute(a, b, op));
                }

                operators.push(ch);
            }
        }

        // final calculation
        while (!operators.isEmpty()) {

            double b = numbers.pop();
            double a = numbers.pop();
            char op = operators.pop();

            numbers.push(compute(a, b, op));
        }

        return String.valueOf(numbers.pop());
    }

    // compute result
    public static double compute(double a, double b, char op) {

        switch (op) {

            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;

            case '/':
                if (b == 0) {
                    System.out.println("Error: divide by zero");
                    return 0;
                }
                return a / b;

            case '^': return Math.pow(a, b);
            case '%': return a % b;

            default: return 0;
        }
    }

    // check operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%';
    }

    // precedence rule
    public static int precedence(char op) {

        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/' || op == '%') return 2;
        if (op == '^') return 3;

        return 0;
    }
}