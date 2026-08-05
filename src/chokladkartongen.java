import java.util.Scanner;

public class chokladkartongen
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int observations = sc.nextInt();
        int lastObs = -1, count = 0;

        for (int i = 0; i < observations; i++)
        {
            int obs = sc.nextInt();
            if (lastObs < obs) count++;
            lastObs = obs;
        }

        System.out.println(count - 1);
    }
}
