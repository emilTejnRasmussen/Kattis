import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class sortofsorting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int namesCount = sc.nextInt(); sc.nextLine();

            if (namesCount == 0) break;

            List<String> lastNames = new ArrayList<>();
            for (int i = 0; i < namesCount; i++)
            {
                lastNames.add(sc.nextLine());
            }

            lastNames.sort(Comparator.comparing(a -> a.substring(0, 2)));
            printNames(lastNames);
            System.out.println();
        }
    }

    private static void printNames(List<String> lastNames)
    {
        for (String lastName : lastNames) {
            System.out.println(lastName);
        }
    }
}
