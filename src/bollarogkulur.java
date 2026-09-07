import java.util.Scanner;

public class bollarogkulur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int current = 1;

        for (int i = 0; i < 5; i++)
        {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a == current) current = b;
            else if (b == current) current = a;
        }

        System.out.println(current);
    }
}
