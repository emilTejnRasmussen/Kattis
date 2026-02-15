import java.util.Scanner;

public class safesquares
{
    private static String[] board = new String[8];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++)
        {
            board[i] = sc.nextLine();
        }

        int count = 0;

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (isSafeSquare(i, j)) count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isSafeSquare(int row, int col)
    {
        if (board[row].contains("R")) return false;
        for (String r : board){
            if (r.charAt(col) == 'R') return false;
        }
        return true;
    }
}
