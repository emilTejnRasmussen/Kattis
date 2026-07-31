import java.util.Scanner;

public class triangularnumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int amount = sc.nextInt();

        for (int i = 1; i <= amount; i++)
        {
            counter += i;
            System.out.println(counter);
        }
    }
}
