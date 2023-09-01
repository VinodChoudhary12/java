import java.util.Scanner;

class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean isGameComplete = false;

        while (!isGameComplete) {
            displayBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                if (checkWin()) {
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    isGameComplete = true;
                } else if (isBoardFull()) {
                    displayBoard();
                    System.out.println("It's a draw!");
                    isGameComplete = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
        scanner.close();
    }

    private boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer ||
                    board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer ||
                board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void displayBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n---------");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
