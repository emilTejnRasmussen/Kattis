import java.util.Scanner;

public class skak
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int xh = sc.nextInt();
        int yh = sc.nextInt();
        int xp = sc.nextInt();
        int yp = sc.nextInt();
        if(xh == xp || yh ==yp)
        {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
