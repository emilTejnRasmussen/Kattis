import java.util.Scanner;

public class pusluspil
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] pieces = new boolean[m];
        int found = 0;

        for (int i = 0; i < n; i++)
        {
            int k = sc.nextInt();

            for (int j = 0; j < k; j++)
            {
                int piece = sc.nextInt();

                if (!pieces[piece - 1])
                {
                    pieces[piece - 1] = true;
                    found++;
                }
            }
        }

        if (found == m)
            System.out.println("Jebb");
        else
            System.out.println("Neibb");
    }
}