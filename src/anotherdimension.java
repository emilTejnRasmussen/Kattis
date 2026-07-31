import java.util.Scanner;

public class anotherdimension
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble()/2.0;

        System.out.println((4.0/3.0 * Math.PI * Math.pow(radius, 3))/2.0);
    }
}
