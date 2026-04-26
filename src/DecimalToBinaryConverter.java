import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args){

        // Declaring a Stack variable with Integer type
        Stack<Integer> DecimalToBinaryConverter = new Stack<>();
        int num = 10;
        System.out.println(num);

        int tem = num;

        DecimalToBinaryConverter.push(tem % 2);
        tem = tem / 2;

        DecimalToBinaryConverter.push(tem % 2);
        tem = tem / 2;










    }
}
