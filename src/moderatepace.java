import java.util.Scanner;

public class moderatepace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        String[] p1 = sc.nextLine().split(" ");
        String[] p2 = sc.nextLine().split(" ");
        String[] p3 = sc.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < days; i++)
        {
            int a = Integer.parseInt(p1[i]);
            int b = Integer.parseInt(p2[i]);
            int c = Integer.parseInt(p3[i]);

            int mid;
            if ((a >= b && a <= c) || (a >= c && a <= b)) mid = a;
            else if ((b >= a && b <= c) || (b >= c && b <= a)) mid = b;
            else mid = c;

            if (i > 0) sb.append(" ");
            sb.append(mid);
        }

        System.out.println(sb);
    }
}
