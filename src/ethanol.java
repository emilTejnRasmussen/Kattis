import java.util.Scanner;

public class ethanol
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("  " + "H ".repeat(n));
        System.out.println("  " + "| ".repeat(n));
        System.out.println("H-" + "C-".repeat(n) + "OH");
        System.out.println("  " + "| ".repeat(n));
        System.out.println("  " + "H ".repeat(n));
    }
}
