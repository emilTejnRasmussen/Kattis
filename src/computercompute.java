import java.util.Scanner;

public class computercompute
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        float x1 = sc.nextFloat(), y1 = sc.nextFloat(), x2 = sc.nextFloat(), y2 = sc.nextFloat();

        System.out.println(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2)));

    }
}
