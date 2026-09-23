import java.util.Scanner;

public class compass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int difference = n2 - n1;

        if (difference > 180)
            difference -= 360;

        if (difference <= -180)
            difference += 360;

        System.out.println(difference);
    }
}
