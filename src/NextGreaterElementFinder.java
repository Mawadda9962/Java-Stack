import java.util.Stack;

public class NextGreaterElementFinder {
    public static void main (String[] args){


        int[] arr = {13, 7, 6, 12};
        int[] result = nextGrater(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " " + result[i]);
        }

    }

    //Simple Next Grater function
    public static int[] nextGrater(int[] arr){

        int[] result = new int[arr.length];
        Stack<String> stack = new Stack<>();

        //initialize all as -1
        for(int i = 0; i < arr.length; i++){
            result[i] = -1;

        }



    }


}
