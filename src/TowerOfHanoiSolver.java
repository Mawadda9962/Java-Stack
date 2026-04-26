import java.util.Stack;

public class TowerOfHanoiSolver {

    static Stack<Integer> A = new Stack<>();
    static Stack<Integer> B = new Stack<>();
    static Stack<Integer> C = new Stack<>();
    static int count = 0;

    public static void main(String[] args) {
        int n = 3;

        // put disks on peg A
        for (int i = n; i >= 1; i--) {
            A.push(i);
        }

        System.out.println("Initial State:");
        displayPegs();

        solveHanoi(n, 'A', 'C', 'B');

        System.out.println("Total Moves      : " + count);
        System.out.println("Minimum Expected : " + (int)(Math.pow(2, n) - 1));
    }

    static void solveHanoi(int n, char from, char to, char aux) {
        // base case: only one disk, just move it
        if (n == 1) {
            move(from, to);
            return;
        }
        // step 1: move n-1 disks from source to auxiliary
        solveHanoi(n - 1, from, aux, to);
        // step 2: move largest disk from source to destination
        move(from, to);
        // step 3: move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, aux, to, from);
    }

    static void move(char from, char to) {
        // get top disk from source peg
        int disk = getPeg(from).pop();
        // put disk on destination peg
        getPeg(to).push(disk);
        count++;
        System.out.println("Move " + count + ": Disk [" + disk + "] " + from + " -> " + to);
        displayPegs();
    }

    // return peg stack by name
    static Stack<Integer> getPeg(char peg) {
        if (peg == 'A') return A;
        if (peg == 'B') return B;
        return C;
    }

    static void displayPegs() {
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
}