import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class knotknowledge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<String> knots = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        List<String> learned = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));

        knots.removeAll(learned);
        System.out.println(knots.getFirst());
    }
}
