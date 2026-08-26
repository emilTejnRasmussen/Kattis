import java.util.Scanner;

public class cupsandballs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int guess = sc.nextInt();
        int swaps = sc.nextInt();
        int ballIsAt = 2;

        for (int i = 0; i < swaps; i++)
        {
            int a = sc.nextInt(), b = sc.nextInt();

            if (a == ballIsAt) ballIsAt = b;
            else if (b == ballIsAt) ballIsAt = a;
        }

        if (ballIsAt == guess){
            for (int i = 1; i <= 3; i++)
            {
                if(i == ballIsAt) continue;
                System.out.print(i + " ");
            }
        } else {
            System.out.print(guess + " " + ballIsAt);
        }
    }
}
