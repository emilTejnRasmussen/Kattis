import java.util.Scanner;

public class budget2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (budget >= a + b + c) System.out.println("Budget is sufficient.");
        else System.out.println("Budget is insufficient.");
    }
}
