import java.util.Scanner;

public class judgingmoose
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt(), right = sc.nextInt();

        System.out.println(getMooseDetails(left, right));
    }

    private static String getMooseDetails(int left, int right)
    {
        if (left == 0 && right == 0)
        {
            return "Not a moose";
        } else if (left == right)
        {
            return "Even " + (left + right);
        } else return "Odd " + (Math.max(left, right) * 2);
    }
}
