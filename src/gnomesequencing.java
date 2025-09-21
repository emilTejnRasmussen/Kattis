import java.util.Arrays;
import java.util.Scanner;

public class gnomesequencing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("Gnomes:");

        for (int i = 0; i < amount; i++)
        {
            int[] beardLengths = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (beardLengths[0] <= beardLengths[1] && beardLengths[1] <= beardLengths[2])
            {
                System.out.println("Ordered");
            } else if (beardLengths[0] >= beardLengths[1] && beardLengths[1] >= beardLengths[2])
            {
                System.out.println("Ordered");
            } else
            {
                System.out.println("Unordered");
            }
        }
    }
}
