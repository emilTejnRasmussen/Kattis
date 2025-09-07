import java.util.Scanner;

public class grafaholur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt(), x = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
        System.out.println((double) y * n * h / (x * m));
    }
}
