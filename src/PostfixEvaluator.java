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


        for(int i = 0; i < expression.length(); i++){
            char a = expression.charAt(i);

            if(Character.isDigit(a)){
                stack.push(Character.getNumericValue(a));
            }else {

                if(stack.size() < 2){
                    System.out.println();
                }



            }


        }






    }
}
