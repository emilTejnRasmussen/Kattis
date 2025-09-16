import java.util.Scanner;

public class maeting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        StringBuilder result = new StringBuilder();
        String[] monAttend = sc.nextLine().split(" ");
        String[] tueAttend = sc.nextLine().split(" ");
        for (String monAtt : monAttend)
        {
            for (String tueAtt : tueAttend)
            {
                if (monAtt.equals(tueAtt))
                {
                    result.append(monAtt).append(" ");
                }
            }
        }
        System.out.println(result);
    }
}
