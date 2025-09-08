import java.util.Scanner;

public class Floors13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        if (floor < 13)
        {
            System.out.println(floor);
        } else
        {
            System.out.println(floor + 1);
        }
    }
}
