import java.util.Scanner;

public class umferd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int spaces = Integer.parseInt(sc.nextLine());
        int testcases = Integer.parseInt(sc.nextLine());
        double dotCount = 0;

        for (int i = 0; i < testcases; i++)
        {
            String testCase = sc.nextLine();
            for (char c : testCase.toCharArray())
            {
                if (c == '.')
                {
                    dotCount++;
                }
            }
        }
        System.out.println(dotCount / (spaces * testcases));
    }
}
