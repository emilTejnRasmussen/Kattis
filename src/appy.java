import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class appy
{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Set<String> appsPicked = new HashSet<>();
        int children = sc.nextInt();

        for (int i = 0; i < children; i++)
        {
            int appsInList = sc.nextInt();
            for (int j = 0; j < appsInList; j++)
            {
                String app = sc.next();
                if (!appsPicked.contains(app)){
                    appsPicked.add(app);
                    System.out.print(app + " ");
                    readAndDismissRest(j, appsInList);
                    break;
                }
            }
        }
    }

    private static void readAndDismissRest(int index, int appsInList)
    {
        for (int i = 0; i < (appsInList - index - 1); i++)
        {
            sc.next();
        }
    }
}
