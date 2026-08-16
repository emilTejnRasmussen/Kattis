import java.util.Scanner;

public class kittenzero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float rate = sc.nextFloat();

        System.out.println(Math.round(1 + rate + (rate * rate) + (rate * rate * rate)));

    }
}
