import java.util.Scanner;

public class catinabox
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt() * sc.nextInt() * sc.nextInt(), c = sc.nextInt();
        if (area == c)
        {
            System.out.println("COZY");
        } else if (area < c)
        {
            System.out.println("TOO TIGHT");
        } else
        {
            System.out.println("SO MUCH SPACE");
        }
    }
}
