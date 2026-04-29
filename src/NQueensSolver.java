import java.util.Stack;

public class NQueensSolver {
    // Position class
    static class QueenPos {
        int x;
        int y;
        QueenPos(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
    public static void main(String[] args) {
        System.out.println("N=0 Solutions: ");
        solveNQueens(0);
        System.out.println("N=1 Solutions: ");
        solveNQueens(1);
        System.out.println("N=3 Solutions: ");
        solveNQueens(3);
        displayAllSolutions(3);

    }
    public static void solveNQueens(int boardSize) {
        if (boardSize == 0) {
            System.out.println("No board for N=0");
            return;
        }
        Stack<QueenPos> activeQueens = new Stack<>();
        int currentRow = 0;
        int currentCol = 0;
        int count = 0;
        while (true) {
            // Find column
            boolean isFound = false;
            while (currentCol < boardSize) {
                QueenPos spot = new QueenPos(currentRow, currentCol);
                if (checkSafety(spot, activeQueens)) {
                    isFound = true;
                    break;
                }
                currentCol++;
            }
            if (isFound) {
                // Place queen
                activeQueens.push(new QueenPos(currentRow, currentCol));
                // Print stack
                System.out.print("Placed queen at (" + currentRow + "," + currentCol + ")  Stack: ");
                for (QueenPos q : activeQueens) {
                    System.out.print("(" + q.x + "," + q.y + ") ");
                }
                // Check win
                if (currentRow == boardSize - 1) {
                    count++;
                    System.out.println("Solution " + count + ":");

                    // Backtrack search
                    QueenPos lastPlaced = activeQueens.pop();
                    currentRow = lastPlaced.x;
                    currentCol = lastPlaced.y + 1;

                } else {
                    // Next row
                    currentRow++;
                    currentCol = 0;
                }

            } else {
                // No spot
                if (activeQueens.isEmpty()) {
                    break;
                }
                QueenPos lastPlaced = activeQueens.pop();
                currentRow = lastPlaced.x;
                currentCol = lastPlaced.y + 1;


            }

        }
        System.out.println("Total Solutions for N=" + boardSize + ": " + count);
    }


    private static boolean checkSafety(QueenPos spot, Stack<QueenPos> activeQueens) {
        for (QueenPos q : activeQueens) {
            if (q.y == spot.y) {
                return false;
            }
            if (Math.abs(q.x - spot.x) == Math.abs(q.y - spot.y)) {
                return false;
            }
        }
        return true;
    }
    public static void displayBoard(Stack<QueenPos> activeQueens, int boardSize) {
        char[][] grid = new char[boardSize][boardSize];
        // Fill grid
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                grid[i][j] = '.';
            }
        }
        // Mark queens
        for (QueenPos q : activeQueens) {
            grid[q.x][q.y] = 'Q';
        }
        // Column numbers
        System.out.print("  ");
        for (int j = 0; j < boardSize; j++) {
            System.out.print(j + " ");
        }
        // Print grid
        for (int i = 0; i < boardSize; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void displayAllSolutions(int boardSize) {
        solveNQueens(boardSize);
    }

}