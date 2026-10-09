import java.util.Scanner;

public class colorfuloutfits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input == 1) System.out.println(1);
        else if (input % 2 == 0) System.out.println(2);
        else System.out.println(3);
    }
}
