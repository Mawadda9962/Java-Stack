import java.util.Stack;

public class EmployeeStackSearch {
    public static void main(String[] args){

        Stack<String> EmployeeStackSearch = new Stack<>();

        //Creating a stack to store employee actions
        EmployeeStackSearch.push("Employee A submitted report");
        EmployeeStackSearch.push("Employee B updating the data");
        EmployeeStackSearch.push("Employee c adding the changes");
        EmployeeStackSearch.push("Employee D completed the report");
        EmployeeStackSearch.push("Employee E logging out");
        EmployeeStackSearch.push("Employee F Approving the report");

        //Displaying the elements on stack
        System.out.println("Stack after pushes: " + EmployeeStackSearch);

        //Displaying stack with their positions from top
        System.out.println("Top element (peek): " + EmployeeStackSearch.peek());

        int position = EmployeeStackSearch.search("Employee A submitted report");
        if (position != -1){
            System.out.println();
        }
    }
}