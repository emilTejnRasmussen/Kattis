import java.util.Scanner;

public class p2048 {
    private static int[][] board = new int[4][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        int dir = sc.nextInt();

        switch (dir) {
            case 0: moveLeft();  break;
            case 1: moveUp();    break;
            case 2: moveRight(); break;
            case 3: moveDown();  break;
        }

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                if (c > 0) System.out.print(" ");
                System.out.print(board[r][c]);
            }
            System.out.println();
        }
    }

    private static void moveLeft() {
        for (int r = 0; r < 4; r++) {
            board[r] = moveRowLeft(board[r]);
        }
    }

    private static void moveRight() {
        for (int r = 0; r < 4; r++) reverseRow(r);
        moveLeft();
        for (int r = 0; r < 4; r++) reverseRow(r);
    }

    private static void moveUp() {
        transpose();
        moveLeft();
        transpose();
    }

    private static void moveDown() {
        transpose();
        moveRight();
        transpose();
    }

    private static int[] moveRowLeft(int[] row) {
        int[] tmp = new int[4];
        int t = 0;

        for (int c = 0; c < 4; c++) {
            if (row[c] != 0) tmp[t++] = row[c];
        }

        int[] res = new int[4];
        int idx = 0;

        for (int c = 0; c < 4; c++) {
            if (tmp[c] == 0) break;

            if (c < 3 && tmp[c] == tmp[c + 1] && tmp[c + 1] != 0) {
                res[idx++] = tmp[c] * 2;
                c++;
            } else {
                res[idx++] = tmp[c];
            }
        }
        return res;
    }

    private static void reverseRow(int r) {
        for (int c = 0; c < 2; c++) {
            int tmp = board[r][c];
            board[r][c] = board[r][3 - c];
            board[r][3 - c] = tmp;
        }
    }

    private static void transpose() {
        for (int r = 0; r < 4; r++) {
            for (int c = r + 1; c < 4; c++) {
                int tmp = board[r][c];
                board[r][c] = board[c][r];
                board[c][r] = tmp;
            }
        }
    }
}
