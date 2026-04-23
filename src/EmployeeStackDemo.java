import java.util.Stack;

public class EmployeeStackDemo {

    public static void main(String[] args){

        // Declaring a Stack variable with String type for employee actions
        Stack<String> EmployeeStackDemo = new Stack<>();

        //Adding 5 meaningful employee action records using push()
        EmployeeStackDemo.push("Employee A logged into system");
        EmployeeStackDemo.push("Employee B submitted report");
        EmployeeStackDemo.push("Employee C updated database records");
        EmployeeStackDemo.push("Employee D approved leave request");
        EmployeeStackDemo.push("Employee E logged out of system");

        //Displaying all elements in the Stack
        System.out.println("Stack after adding 5 actions:");
        System.out.println(EmployeeStackDemo);

        //Adding one more employee action record
        EmployeeStackDemo.push("Employee F generated monthly report");

        //Displaying updated stack
        System.out.println("Stack after adding one more action:");
        System.out.println(EmployeeStackDemo);
    }
}