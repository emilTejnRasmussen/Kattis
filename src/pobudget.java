import java.util.Scanner;

public class pobudget
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < amount; i++)
        {
            String waste = sc.nextLine();
            sum += Integer.parseInt(sc.nextLine());
        }
        if (sum > 0)
        {
            System.out.println("Usch, vinst");
        } else if (sum == 0)
        {
            System.out.println("Lagom");
        } else
        {
            System.out.println("Nekad");
        }
    }
}
