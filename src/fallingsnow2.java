import java.util.Arrays;
import java.util.Scanner;

public class fallingsnow2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[rows][cols];

        for (int i = 0; i < rows; i++)
        {
            String line = sc.nextLine();
            for (int j = 0; j < cols; j++)
            {
                grid[i][j] = line.charAt(j);
            }
        }

        int[] snowCountInCol = new int[cols];
        for (int i = 0; i < cols; i++)
        {
            int count = 0;
            for (int j = 0; j < rows; j++)
            {
                if (grid[j][i] == 'S') count++;
            }
            snowCountInCol[i] = count;
        }

        String[] rs = new String[rows];
        for (int i = 0; i < rows; i++)
        {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols; j++)
            {
                if (snowCountInCol[j] > 0){
                    sb.append("S");
                    snowCountInCol[j]--;
                }
                else {
                    sb.append(".");
                }
            }
            rs[i] = sb.toString();
        }

        for (int i = rows - 1; i >= 0; i--)
        {
            System.out.println(rs[i]);
        }
    }
}
