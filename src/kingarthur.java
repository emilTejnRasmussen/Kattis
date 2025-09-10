import java.util.Scanner;

public class kingarthur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double d = Double.parseDouble(sc.nextLine());
        double room = Double.parseDouble(sc.nextLine());
        int knights = sc.nextInt();

        if ((d * Math.PI) - (room * knights) >= 0)
        {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        }
    }
}
