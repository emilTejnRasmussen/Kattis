import java.util.Scanner;

public class cattoys
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println((int) Math.ceil((double ) n/k));
    }
}
