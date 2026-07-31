import java.util.Scanner;

public class findmaximum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        printLargest(a, b, c);
    }

    private static void printLargest(int a, int b, int c)
    {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println(largest);
    }
}
