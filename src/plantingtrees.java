import java.util.*;

public class plantingtrees
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int seedlings = sc.nextInt(), count = 2;
        List<Integer> growthDays = new ArrayList<>();

        for (int i = 0; i < seedlings; i++)
        {
            growthDays.add(sc.nextInt());
        }

        growthDays.sort(Comparator.reverseOrder());

        for (int i = 0; i < seedlings; i++)
        {
            growthDays.set(i, growthDays.get(i) + count);
            count++;
        }

        System.out.println(Collections.max(growthDays));
    }
}
