import java.util.Scanner;

public class thendaysofchristmas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;


        for (int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        System.out.println((n * (n + 1) * (n + 2)) / 6);
    }
}
