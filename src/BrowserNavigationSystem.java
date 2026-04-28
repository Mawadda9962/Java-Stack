import java.util.Stack;

public class BrowserNavigationSystem {

    //Adding Stacks for back and forward navigation
    static Stack<String> backStack = new Stack<>();
    static Stack<String> forwardStack = new Stack<>();

    // Store current page
    static String currentPage = "Home";
    static int max = 10;

    public static void main(String[] args){

        visitPage("LinkedIn.com");
        visitPage("Google.com");
        visitPage("CodeLine.com");
        visitPage("SnapChat.com");
        visitPage("youtube.com");

        goBack();
        goBack();
        goForward();
        visitPage("stackoverflow.com");



    }

    //method to visit new page
    static void visitPage(String url) {

    }
}
