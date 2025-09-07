import java.util.Scanner;

public class takkfyrirmig
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < amount; i++)
        {
            System.out.printf("Takk %s\n", sc.nextLine());
        }
    }
}
