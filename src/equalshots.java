import java.util.Scanner;

public class equalshots
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int firstShot = sc.nextInt();
        int secondShot = sc.nextInt();
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < firstShot; i++)
        {
            sum1 += sc.nextInt() * sc.nextInt();
        }
        for (int i = 0; i < secondShot; i++)
        {
            sum2 += sc.nextInt() * sc.nextInt();
        }
        String result = sum1 == sum2 ? "same" : "different";
        System.out.println(result);
    }
}
