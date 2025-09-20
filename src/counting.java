import java.util.Scanner;

public class counting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = num;

        for (int i = 0; i < 12; i++)
        {
            System.out.println(res);
            res += num;
        }
    }
}
