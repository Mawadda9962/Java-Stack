import java.util.Stack;

public class HtmlTagValidator {
    public static void main(String[] args){

        String html1 = "<b>Text</b>";
        String htmal2 = ""


    }
    public static boolean validate(String html){

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < html.length(); i++){
            // check for opening <
            if(html.charAt(i) == '<'){
                int end = html.indexOf('>', i);
                String tag = html.substring(i + 1, end);

                System.out.println("Tag: " + tag);

                // closing tag
                if(tag.startsWith("/")){

                    String name = tag.substring(1);

                    if(stack.isEmpty()){
                        System.out.println("Error: no opening tag");
                        return false;
                    }

                    String top = stack.pop();

                    if(!top.equals(name)){
                        System.out.println("Error: not matching");
                        return false;
                    }
                }
                else{
                    stack.push(tag);

                }
                System.out.println(stack);

                i = end;


            }
        }

        if(stack.isEmpty()){
            System.out.println("Valid");
            return true;

        }else {
            System.out.println("Error");
            return false;
        }



    }
}
