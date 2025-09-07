import java.util.Scanner;

public class sumkindofproblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < p; i++)
        {
            int k = sc.nextInt(), n = sc.nextInt();
            int s1 = (n * (n + 1)) / 2, s2 = n * n, s3 = n * (n + 1);
            System.out.printf("%s %s %s %s\n", k, s1, s2, s3);
        }
    }
}
