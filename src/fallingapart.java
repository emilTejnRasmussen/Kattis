import java.util.*;

public class fallingapart
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amountOfIntegers = sc.nextInt();
        List<Integer> integers = new ArrayList<>();
        int aliceCount = 0, bobCount = 0;

        for (int i = 0; i < amountOfIntegers; i++)
        {
            integers.add(sc.nextInt());
        }

        Collections.sort(integers);
        integers = integers.reversed();

        int startingSize = integers.size();
        for (int i = 0; i < startingSize; i++)
        {
            if (i % 2 == 0) aliceCount += integers.getFirst();
            else bobCount += integers.getFirst();

            integers.removeFirst();
        }
        System.out.printf("%s %s", aliceCount, bobCount);
    }
}
