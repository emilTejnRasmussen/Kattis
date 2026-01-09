import java.util.Scanner;

public class numberreduction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (num > 1)
        {
            if (num % 2 == 0)
            {
                num = num / 2;
            } else
            {
                num = num + num * 2 + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
