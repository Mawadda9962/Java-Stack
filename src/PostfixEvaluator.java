import java.util.Stack;

public class PostfixEvaluator {
    public static void main(String[] args){

        String num = " 3 5 +";

    }

    public static Integer evaluatePostfix(String expression){

        // Declaring a Stack variable with Integer type
        Stack<Integer> stack = new Stack<>();

        //Empty or null
        if (expression == null || expression.isEmpty() ){
            System.out.println("Empty expression");
            return null;
        }


        //push operator on stack
        for(int i = 0; i < expression.length(); i++){
            char a = expression.charAt(i);

            if(Character.isDigit(a)){
                stack.push(Character.getNumericValue(a));
            }else {

                if(stack.size() < 2){
                    System.out.println("Invalid expression");
                    return null;
                }

                //pop operand
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                //use multiple operator
                switch(a){
                    case '+':
                        stack.push(operand2 + operand1);
                        break;

                    case '-':
                        stack.push(operand2 + operand1);
                        break;

                    case '*':
                        stack.push(operand2 + operand1);
                        break;

                    case'/':
                        if(operand1 == 0){
                            System.out.println("Division by zero");
                            return null;
                        }

                        stack.push(operand2 / operand1);
                        break;

                    case '%':
                        stack.push(operand2 % operand1);
                        break;
                    default:
                        System.out.println("Invalid operator");
                        stack.clear();
                        return null;
                }
            }
        }
        return stack.pop();
    }
}





