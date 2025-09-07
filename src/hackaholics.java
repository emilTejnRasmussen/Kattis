import java.util.Scanner;

public class hackaholics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int noUse = sc.nextInt();
        int money = sc.nextInt();
        System.out.println(n*money);
    }
}
