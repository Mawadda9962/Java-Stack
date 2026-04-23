import java.util.Stack;

public class EmployeeStackDemo {

    public static void main(String[] args){
        Stack<String> EmployeeStackDemo = new Stack<>();

        //Creating a stack to store employee actions
        EmployeeStackDemo.push("Employee A submitted report");
        EmployeeStackDemo.push("Employee B updating the data");
        EmployeeStackDemo.push("Employee c adding the changes");
        EmployeeStackDemo.push("Employee D completed the report");
        EmployeeStackDemo.push("Employee E logging out");

        //Displaying the elements on stack
        System.out.println("Stack after pushes: " + EmployeeStackDemo);

        // Adding one more employee action record
        EmployeeStackDemo.push("Employee F Approving the report");


        //Displaying the elements on stack after adding one more employee action record
        System.out.println("Stack after pushes: " + EmployeeStackDemo);



    }

}
