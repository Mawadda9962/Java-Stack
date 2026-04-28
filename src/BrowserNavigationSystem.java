import java.util.Stack; // import stack class

public class BrowserNavigationSystem {

    // stacks for navigation
    static Stack<String> back = new Stack<>();     // store previous pages
    static Stack<String> forward = new Stack<>();  // store next pages

    static String currentPage = ""; // current page
    static int max = 10;            // max size of back history

    public static void main(String[] args) {

        // visiting pages
        visit("Codline.om");
        visit("linkedIn.com");
        visit("gitHub.com");
        visit("z.com");
        visit("reddit.com");

        // navigation actions
        back();        // go back one page
        back();        // go back again
        forward();     // go forward
        visit("stackoverflow.com"); // new visit clears forward history

        forward();     // try forward (may not work)
        back();        // go back

        history();     // show final history
    }

    // method to visit new page
    static void visit(String url) {

        // check if back stack reached limit
        if (back.size() >= max) {
            System.out.println("History limit reached");
            back.remove(0); // remove oldest page
        }

        // save current page before moving
        if (!currentPage.isEmpty()) {
            back.push(currentPage);
        }
