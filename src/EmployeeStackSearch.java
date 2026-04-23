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

        //Displaying the elements on stack
        System.out.println("Stack after pushes: " + EmployeeStackSearch);

        // Adding one more employee action record
        EmployeeStackSearch.push("Employee F Approving the report");


        //Displaying the elements on stack after adding one more employee action record
        System.out.println("Stack after pushes: " + EmployeeStackSearch);



    }

}