import java.util.Arrays;
import java.util.Scanner;

public class isolationintrusion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int crewSize = sc.nextInt();

        int[] hermits = Arrays.stream(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}).sorted().toArray();
        int hermitsAfterCrew = hermits[0] + crewSize;

        if (hermitsAfterCrew < hermits[1]) System.out.println(hermitsAfterCrew);
        else System.out.println("impossible");
    }
}
