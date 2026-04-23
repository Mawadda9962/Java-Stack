import java.util.Stack;

public class EmployeeStackDemo {

    public static void main(String[] args){
        Stack<String> EmployeeStackDemo = new Stack<>();

        EmployeeStackDemo.push("Employee A submitted report");
        EmployeeStackDemo.push("Employee B updating the data");
        EmployeeStackDemo.push("Employee c adding the changes");
        EmployeeStackDemo.push("Employee D completed the report");
        EmployeeStackDemo.push("Employee E logging out");

        System.out.println("Stack after pushes: " + EmployeeStackDemo);






    }

}
