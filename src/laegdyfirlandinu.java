import java.util.Scanner;

public class laegdyfirlandinu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] pressures = new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                pressures[i][j] = sc.nextInt();
            }
        }

        boolean isLowPressure = false;

        outer:
        for (int i = 1; i < n - 1; i++)
        {
            for (int j = 1; j < m - 1; j++)
            {
                if (
                        pressures[i + 1][j] > pressures[i][j] &&
                                pressures[i - 1][j] > pressures[i][j] &&
                                pressures[i][j + 1] > pressures[i][j] &&
                                pressures[i][j - 1] > pressures[i][j]
                )
                {
                    isLowPressure = true;
                    break outer;
                }
            }
        }

        System.out.println(isLowPressure ? "Jebb" : "Neibb");
    }
}
