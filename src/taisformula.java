import java.util.Scanner;

public class taisformula
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        double[] v = new double[n];

        double totalArea = 0;

        for (int i = 0; i < n; i++)
        {
            t[i] = sc.nextInt();
            v[i] = sc.nextDouble();
        }

        for (int i = 1; i < n; i++)
        {
            double dt = (t[i] - t[i-1]) / 1000.0;
            double area = (v[i] + v[i-1]) / 2 * dt;
            totalArea += area;
        }
        System.out.println(totalArea);
    }
}
