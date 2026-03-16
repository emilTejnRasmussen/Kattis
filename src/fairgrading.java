import java.util.Scanner;

public class fairgrading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt(), m2 = sc.nextInt(), f = sc.nextInt();

        double total = (m1 + m2 + (2 * f)) / 4.0;

        if (total >= 90) System.out.println("A");
        else if (total >= 80) System.out.println("B");
        else if (total >= 70) System.out.println("C");
        else if (total >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
