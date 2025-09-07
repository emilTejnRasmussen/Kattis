import java.util.Scanner;

public class bladra2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int a = sc.nextInt();
        int t = sc.nextInt();

        System.out.println(v*t+0.5*a*t*t);
    }
}
