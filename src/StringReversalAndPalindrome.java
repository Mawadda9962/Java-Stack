import java.util.Stack;

public class StringReversalAndPalindrome {
    public static void main(String[] args){

        Stack<Character> EmployeeStackSearch = new Stack<>();

        String title1 = "hello";

        System.out.println("Original: " + title1);

        // Push characters
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

        // Reverse using pop
        String reversed = "";

        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();
        reversed += EmployeeStackSearch.pop();

        System.out.println("Reversed: " + reversed);

        // Palindrome check (CALL METHOD)
        System.out.println("Is Palindrome: " + palindrome(title1));
    }

    public static boolean palindrome(String str){

        if(str == null){
            return false;
        }

        //Converting to lowercase
        str = str.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        // compare with reversed order
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != stack.pop()){
                return false;
            }
        }

        return true;
    }
}