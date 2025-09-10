import java.util.Scanner;

public class rectanglearea
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] doubles = sc.nextLine().split(" ");
        double x1 = Double.parseDouble(doubles[0]), y1 = Double.parseDouble(doubles[1]), x2 = Double.parseDouble(doubles[2]), y2 = Double.parseDouble(doubles[3]);
        double result = Math.abs(y2 - y1) * Math.abs(x2 - x1);
        System.out.printf("%3f\n", result);
    }
}
