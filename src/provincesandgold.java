import java.util.Scanner;

public class provincesandgold
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt(), s = sc.nextInt(), c = sc.nextInt();

        int totalBuyPower = (g * 3) + (s * 2) + (c);

        String vicCard = "", treCard = "";

        if (totalBuyPower < 2)
        {
            System.out.println("Copper");
            return;
        }

        if (totalBuyPower >= 8) vicCard = "Province";
        else if (totalBuyPower >= 5) vicCard = "Duchy";
        else vicCard = "Estate";

        if (totalBuyPower >= 6) treCard = "Gold";
        else if (totalBuyPower >= 3) treCard = "Silver";
        else treCard = "Copper";

        System.out.println(vicCard + " or " + treCard);
    }
}
