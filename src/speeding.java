import java.util.Scanner;

public class speeding
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int photographsTaken = sc.nextInt() - 1;

        int t = sc.nextInt(), d = sc.nextInt();
        int maxSpeed = 0;

        for (int i = 0; i < photographsTaken; i++)
        {
            int nextT = sc.nextInt(), nextD = sc.nextInt();

            int speed = (nextD - d) / (nextT - t);

            if (speed > maxSpeed) maxSpeed = speed;

            t = nextT;
            d = nextD;
        }

        System.out.println(maxSpeed);
    }
}
