import java.util.Scanner;

public class aleidibio
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        System.out.println(c-(a+b));
    }
}
