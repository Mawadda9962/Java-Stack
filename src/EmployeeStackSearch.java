import java.util.Stack;

public class EmployeeStackSearch {
    public static void main(String[] args){

        Stack<String> EmployeeStackSearch = new Stack<>();

        //Creating a stack to store employee actions
        EmployeeStackSearch.push("Employee A submitted report");
        EmployeeStackSearch.push("Employee B updating the data");
        EmployeeStackSearch.push("Employee C adding the changes");
        EmployeeStackSearch.push("Employee D completed the report");
        EmployeeStackSearch.push("Employee E logging out");
        EmployeeStackSearch.push("Employee F Approving the report");

        //Displaying the elements on stack
        System.out.println("Stack after pushes: " + EmployeeStackSearch);

        //Displaying stack with their positions from top
        System.out.println("Top element (peek): " + EmployeeStackSearch.peek());

        //Useing search() to find the position of different employee actions
        int position1 = EmployeeStackSearch.search("Employee A submitted report");
        if (position1 != -1){
            System.out.println("Element A found at position" + position1);

        }else {
            System.out.println("Employee action not found");
        }

        //Useing search() to find the position of second employee actions
        int position2 = EmployeeStackSearch.search("Employee C adding the changes");
        if (position2 != -1){
            System.out.println("Element C found at position " + position2);
        }else {
            System.out.println("Employee action not found");
        }

        //Useing contains() to check if specific actions exist in the stack
        System.out.println(EmployeeStackSearch.contains("Employee E logging out"));


        //Iterating through the stack using a standard for loop (from top to bottom)
        System.out.println("Stack elements");
        for(String actions : EmployeeStackSearch){
            System.out.println(actions);

        }


    }
}