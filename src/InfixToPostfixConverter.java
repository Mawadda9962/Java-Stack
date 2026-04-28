import java.util.Stack;

public class InfixToPostfixConverter {

    static Stack<Double> numbers = new Stack<>();
    static Stack<Character> operators = new Stack<>();


    public static void main(String[] args){



    }

    public static String evaluate (String expression){

        //clear stacks before each evaluation
        numbers.clear();
        operators.clear();

        for(int i = 0; i < expression.length(); i++ ){
            char a = expression.charAt(i);

            //ignore spaces
            if (a == ' ') continue;

            //if number handling  multi-digit + decimals
            if (Character.isDigit(a) || a == "."){

                StringBuilder num = new StringBuilder();

                // build full number
                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {

                    num.append(expression.charAt(i));
                    i++;
                }


                i--; // step back after loop

                // push number into operand stack
                numbers.push(Double.parseDouble(num.toString()));
            }




        }


        }


    }


}
