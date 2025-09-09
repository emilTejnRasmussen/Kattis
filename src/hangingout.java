import java.util.Scanner;

public class hangingout
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int events = Integer.parseInt(sc.nextLine().trim());
        int rejectedGroups = 0, curLimit = 0;

        for (int i = 0; i < events; i++)
        {
            String[] event = sc.nextLine().split(" ");
            int groupSize = Integer.parseInt(event[1]);
            if (event[0].equals("enter"))
            {
                if (groupSize + curLimit <= l) //Letting in the group
                {
                    curLimit += groupSize;
                } else { //Group rejected
                    rejectedGroups++;
                }
            } else // group leaving
            {
                curLimit -= groupSize;
            }
        }

        System.out.println(rejectedGroups);

    }
}
