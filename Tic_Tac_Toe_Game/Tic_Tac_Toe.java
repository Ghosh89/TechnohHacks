import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        gameTicTacToe(board);
        sc.close();
    }

    public static void gameTicTacToe(char[][] board) {
        boolean gameOver = false;
        boolean isDrawGame = false;
        char player = 'X';
        Scanner sc = new Scanner(System.in);
        while (!gameOver || !isDrawGame) {
            printBoard(board);
            System.out.print("Player " + player + " Enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won");
                    break;
                } else {
                    player = (player == 'X') ? '0' : 'X';
                }
                isDrawGame = isDraw(board);
                if (isDrawGame) {
                    System.out.println(" Draw ");
                    break;
                }
            } else {
                System.out.println("Invalid move");
            }
        }
        printBoard(board);
        sc.close();
    }

    // public static boolean isDraw(char[][] board) {

    // }

    public static boolean isDraw(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (col != 2) {
                    System.out.print(board[row][col] + " | ");
                } else {
                    System.out.print(board[row][col]);
                }
            }
            System.out.println();
        }
    }
}
