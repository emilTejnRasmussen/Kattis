import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class callforproblemsround2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Set<Integer> nums = new HashSet<>();


        for (int i = 0; i < n; i++)
        {
            nums.add(sc.nextInt());
        }

        System.out.println(Math.min(nums.size(), k));
    }
}
