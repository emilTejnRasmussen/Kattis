import java.util.Scanner;

public class heysata
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nonsense = sc.nextLine();
        String k = sc.nextLine();
        if (sc.nextLine().contains(k))
        {
            System.out.println("Unnar fann hana!");
        } else
        {
            System.out.println("Unnar fann hana ekki!");
        }
    }
}
