import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class keysphonewallet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean hasWallet = false, hasPhone = false, hasKeys = false;

        for (int i = 0; i < n; i++)
        {
            String item = sc.nextLine();
            if (item.equals("wallet"))
            {
                hasWallet = true;
            }
            if (item.equals("keys"))
            {
                hasKeys = true;
            }
            if (item.equals("phone"))
            {
                hasPhone = true;
            }
        }
        if (!hasKeys)
        {
            System.out.println("keys");
        }
        if (!hasPhone)
        {
            System.out.println("phone");
        }
        if (!hasWallet)
        {
            System.out.println("wallet");
        }
        if (hasWallet && hasPhone && hasKeys)
        {
            System.out.println("ready");
        }
    }
}
