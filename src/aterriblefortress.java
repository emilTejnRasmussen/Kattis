import java.util.Scanner;

public class aterriblefortress
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int section = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < section; i++)
        {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
