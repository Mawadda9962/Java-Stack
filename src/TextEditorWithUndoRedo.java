import java.util.Stack;

public class TextEditorWithUndoRedo {
    public static void main(String[] args){

        // Creating two stacks (undo and redo)
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        // Current text
        StringBuilder text = new StringBuilder();

        // Type Hello
        undoStack.push(text.toString());
        text.append("Hello");
        redoStack.clear();
        System.out.println("Type: Hello");
        display(text, undoStack, redoStack);

        // Type World
        undoStack.push(text.toString());
        text.append(" World");
        redoStack.clear();
        System.out.println("Type: World");
        display(text, undoStack, redoStack);

        // Undo
        if(!undoStack.isEmpty()){
            redoStack.push(text.toString());
            text = new StringBuilder(undoStack.pop());
        } else {
            System.out.println("Nothing to undo");
        }
        System.out.println("Undo");
        display(text, undoStack, redoStack);

        // Redo
        if(!redoStack.isEmpty()){
            undoStack.push(text.toString());
            text = new StringBuilder(redoStack.pop());
        } else {
            System.out.println("Nothing to redo");
        }
        System.out.println("Redo");
        display(text, undoStack, redoStack);
    }

    // Display method
    public static void display(StringBuilder text, Stack<String> undoStack, Stack<String> redoStack){
        System.out.println(text);
        System.out.println(undoStack);
        System.out.println(redoStack);
    }
}