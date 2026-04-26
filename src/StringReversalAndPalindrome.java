import java.util.Locale;
import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args){

        Stack<Character> EmployeeStackSearch = new Stack<>();

        //First string
        String title1 = "hello";

        //Pushing characters
        EmployeeStackSearch.push('h');
        System.out.println(EmployeeStackSearch);


        EmployeeStackSearch.push('e');
        System.out.println(EmployeeStackSearch);

        EmployeeStackSearch.push('l');
        System.out.println(EmployeeStackSearch);

        EmployeeStackSearch.push('l');
        System.out.println(EmployeeStackSearch);

        EmployeeStackSearch.push('o');
        System.out.println(EmployeeStackSearch);

        //reversing using pop()

        String reversed = "";

        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();

        //printing
        System.out.println(reversed);
    }
        public static boolean palindrome(String str){

        if(str == null){
            return false;
        }
            str = str.toLowerCase();

        //convert to lower case
        Stack<Character> stack = new Stack<>();

        //push all characters
        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }





        }











}
