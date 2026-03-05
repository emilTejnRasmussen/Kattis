import java.util.Scanner;

public class zoom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(); sc.nextLine();
        String[] nums = sc.nextLine().split(" ");
        for (int i = 0; i < nums.length; i++)
        {
            if ((i + 1) % k == 0) System.out.print(nums[i] + " ");
        }
    }
}
