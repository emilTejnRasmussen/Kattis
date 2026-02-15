import java.util.Scanner;

public class internationaldates
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        int first = Integer.parseInt(date.substring(0,2));
        int second = Integer.parseInt(date.substring(3,5));

        if (first <= 12 && second <= 12) System.out.println("either");
        else if (first > 12) System.out.println("EU");
        else System.out.println("US");
    }
}
