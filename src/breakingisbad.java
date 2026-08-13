import java.util.Scanner;

public class breakingisbad
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int minWait = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            int wait = calcWaitSum(sc.nextLine());
            if (wait < minWait) minWait = wait;

            if (minWait == 0)  break;
        }

        System.out.println(minWait);
    }

    private static int calcWaitSum(String s)
    {
        String[] classes = s.split(" ");
        if (classes.length == 1) return 0;

        int cumulativeSum = 0;

        for (int i = 0; i < classes.length - 1; i++)
        {
            String currentClass = classes[i];
            String nextClass = classes[i + 1];

            int diff = getDiff(currentClass, nextClass);

            cumulativeSum += diff;
        }

        return cumulativeSum;
    }

    private static int getDiff(String currentClass, String nextClass)
    {
        String endClass = currentClass.substring(currentClass.indexOf("-") + 1);
        String startOfNext = nextClass.substring(0, nextClass.indexOf("-"));

        return calcDiff(
                Integer.parseInt(endClass.substring(0, endClass.indexOf(":"))),
                Integer.parseInt(endClass.substring(endClass.indexOf(":") + 1)),
                Integer.parseInt(startOfNext.substring(0, startOfNext.indexOf(":"))),
                Integer.parseInt(startOfNext.substring(startOfNext.indexOf(":") + 1))
        );
    }

    private static int calcDiff(int endHour, int endMinute,
                                int startNextHour, int startNextMinute)
    {
        int endTime = endHour * 60 + endMinute;
        int startNextTime = startNextHour * 60 + startNextMinute;

        return startNextTime - endTime;
    }
}
