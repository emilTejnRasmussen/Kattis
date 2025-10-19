import java.util.Scanner;

public class prsteni
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rings = sc.nextInt(), firstRing = sc.nextInt();

        for (int i = 0; i < rings-1; i++)
        {
            int ring = sc.nextInt();
            int g = gcd(firstRing, ring);
            int den = ring / g;
            int num = firstRing / g;
            System.out.printf("%d/%d%n", num, den);
        }
    }

    // Euclidean algorithm
    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
