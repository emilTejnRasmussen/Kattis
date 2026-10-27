import java.util.Scanner;

public class espressomacchiato
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            int gridSize = sc.nextInt();

            for (int j = 0; j < gridSize; j++)
            {
                System.out.println(".".repeat(gridSize - j - 1) + "C" + ".".repeat(j));
            }
        }
    }
}
