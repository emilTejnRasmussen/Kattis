import java.util.Scanner;

public class millifaersla
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        String lowest ="Monnei";
        if (b<a)
        {
            lowest = "Fjee";
        }
        if (c<Math.min(a,b))
        {
            lowest = "Dolladollabilljoll";
        }

        System.out.println(lowest);
    }
}
