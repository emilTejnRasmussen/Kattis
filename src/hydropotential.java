import java.util.Scanner;

public class hydropotential
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            int m = sc.nextInt();
            int g = 10;
            int h = sc.nextInt();

            System.out.println(m * g * h);
        }
    }
}
