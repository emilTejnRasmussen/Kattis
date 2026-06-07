import java.util.Scanner;

public class transitwoes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int timer = 0;
        int timeLeft = sc.nextInt();
        int timeHaveToArrive = sc.nextInt();
        int transitRoutes = sc.nextInt();
        int[] walksBetweenBusses = new int[transitRoutes + 1];
        int[] transitTimes = new int[transitRoutes];
        int[] transitIntervals = new int[transitRoutes];

        retrieveDataFromInput(transitRoutes, walksBetweenBusses, sc, transitTimes, transitIntervals);

        for (int i = 0; i < transitRoutes; i++)
        {
            int walkTime = walksBetweenBusses[i];
            timer += walkTime;

            int interval = transitIntervals[i];

            if (timer % interval != 0) {
                timer += interval - (timer % interval);
            }

            timer += transitTimes[i];
        }

        timer += walksBetweenBusses[walksBetweenBusses.length - 1];

        if (timer + timeLeft > timeHaveToArrive) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    private static void retrieveDataFromInput(int transitRoutes, int[] walksBetweenBusses, Scanner sc, int[] transitTimes, int[] transitIntervals)
    {
        for (int i = 0; i < transitRoutes + 1; i++)
        {
            walksBetweenBusses[i] = sc.nextInt();
        }

        for (int i = 0; i < transitRoutes; i++)
        {
            transitTimes[i] = sc.nextInt();
        }

        for (int i = 0; i < transitRoutes; i++)
        {
            transitIntervals[i] = sc.nextInt();
        }
    }
}
