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

        //Simulate pressing Back button 2 times using pop()
        BrowserHistorySimulator.pop();
        System.out.println("Current page: " + BrowserHistorySimulator.peek());

        BrowserHistorySimulator.pop();
        System.out.println("Current page: " + BrowserHistorySimulator.peek());

        //Using peek() to show the current page without navigating
        System.out.println("Peek current page: " + BrowserHistorySimulator.peek());

        //Checking if the history is empty at different points
        System.out.println("Is history empty? " + BrowserHistorySimulator.isEmpty());


        BrowserHistorySimulator.push("openai.com");
        System.out.println(BrowserHistorySimulator.peek());

        BrowserHistorySimulator.push("Google.com");
        System.out.println(BrowserHistorySimulator.peek());

        System.out.println();






    }




    }
