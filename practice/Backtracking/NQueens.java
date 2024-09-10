import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Start solving the problem
        solve(0, board, result);
        return result;
    }

    private void solve(int row, char[][] board, List<List<String>> result) {
        int n = board.length;

        // If row equals n, it means we have placed queens in all rows
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 'Q'; // Place the queen
                solve(row + 1, board, result); // Recursively try to place queen in next row
                board[row][col] = '.'; // Backtrack and remove the queen
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        int n = board.length;

        // Check if there's a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private List<String> constructBoard(char[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            list.add(new String(board[i]));
        }
        return list;
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 4;
        List<List<String>> solutions = nQueens.solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
