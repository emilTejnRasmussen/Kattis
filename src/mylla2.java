import java.util.Arrays;
import java.util.Scanner;

public class mylla2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++)
        {
            board[i] = sc.nextLine().split("");
        }
        boolean hasWon = false;
        for (int i = 0; i < 3; i++)
        {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && board[i][0].equals("O"))
            {
                hasWon = true;
                break;
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && board[0][i].equals("O")){
                hasWon = true;
                break;
            }
        }

        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && board[0][0].equals("O")){
            hasWon = true;
        }else if (board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && board[0][2].equals("O")){
            hasWon = true;
        }

        if (hasWon) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }


    }
}
