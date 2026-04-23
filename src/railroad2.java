import java.util.Scanner;

public class railroad2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();

        if (y % 2 != 0) System.out.println("impossible");
        else System.out.println("possible");
    }
}
