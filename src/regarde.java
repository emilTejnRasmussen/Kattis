import java.util.Scanner;

public class regarde
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++)
        {
            int hs = sc.nextInt();

            System.out.println("sh" + "h".repeat(hs));
        }
    }
}
