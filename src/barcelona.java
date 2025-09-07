import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class barcelona
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int bags = sc.nextInt();
        int bennisBag = sc.nextInt();
        sc.nextLine();
        ArrayList<String> allBags = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        int bennyPos = allBags.indexOf(String.valueOf(bennisBag)) + 1;
        if (bennyPos == 1)
        {
            System.out.println("fyrst");
        } else if (bennyPos == 2)
        {
            System.out.println("naestfyrst");
        } else
        {
            System.out.printf("%d fyrst", bennyPos);
        }
    }
}
