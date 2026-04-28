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

        forward();
        back();

        history();
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

        forward.clear();

        //Set new page as current
        currentPage = url;

        System.out.println("url");

    }
    // method to go back
    static void back() {

        // check if no page to go back to
        if (back.isEmpty()) {
            System.out.println("No back history");
            return;
        }
        forward.push(currentPage);

        // get last page from back stack
        currentPage = back.pop();

        // print result
        System.out.println("Back  : " + currentPage);
    }

    static void forward() {

        // check if no forward page
        if (forward.isEmpty()) {
            System.out.println("No forward history");
            return;
        }

        // move current page to back stack
        back.push(currentPage);

        // get next page from forward stack
        currentPage = forward.pop();

        // print result
        System.out.println("Forward : " + currentPage);
    }
    static void show(){
        System.out.println(currentPage);


    }
}

