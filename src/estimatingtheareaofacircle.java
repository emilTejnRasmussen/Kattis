import java.util.Scanner;

public class estimatingtheareaofacircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double r = Double.parseDouble(sc.next());
            int m = sc.nextInt(), n = sc.nextInt(); sc.nextLine();
            if (r==0 && m == 0 && n == 0) {
                break;
            }

            System.out.print((r * r * Math.PI) + " ");
            System.out.println((1.0 * n/m) * (4 * Math.pow(r, 2)));
        }
    }
}
