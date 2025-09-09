import java.util.Scanner;

public class fimmtudagstilbod
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 2020)
        {
            System.out.println(1000);
        } else
        {
            System.out.println(1000 + ((year - 2020) * 100));
        }
    }
}
