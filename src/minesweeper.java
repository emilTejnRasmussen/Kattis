import java.util.Arrays;
import java.util.Scanner;

public class minesweeper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[sc.nextInt()][sc.nextInt()];
        int hacks = sc.nextInt();sc.nextLine();
        for (int i = 0; i < hacks; i++)
        {
            board[sc.nextInt()-1][sc.nextInt()-1] = "*";
        }

        for (String[] strings : board)
        {
            for (int j = 0; j < strings.length; j++)
            {
                if (strings[j] == null)
                {
                    System.out.print(".");
                } else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
