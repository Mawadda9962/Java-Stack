import java.util.Stack;

public class BrowserHistorySimulator {

    public static void main(String[] args){
        Stack<String> BrowserHistorySimulator = new Stack<>();

        //Creating a stack to store web pages
        BrowserHistorySimulator.push("github.com");
        System.out.println(BrowserHistorySimulator.peek());

        BrowserHistorySimulator.push("youtube.com");
        System.out.println(BrowserHistorySimulator.peek());

        BrowserHistorySimulator.push("facebook.com");
        System.out.println(BrowserHistorySimulator.peek());

        BrowserHistorySimulator.push("google.com");
        System.out.println(BrowserHistorySimulator.peek());

        BrowserHistorySimulator.push("Netflex.com");
        System.out.println(BrowserHistorySimulator.peek());


        // Display full history
        System.out.println("Full History: " + BrowserHistorySimulator);










    }




    }
