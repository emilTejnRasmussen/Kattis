import java.util.Scanner;

public class rollingthedice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String first = input.split("d")[0];
        int multiplier = Integer.parseInt(first);
        String[] nums = input.substring(first.length() + 1).split("\\+");

        int die = Integer.parseInt(nums[0]);
        int addition = Integer.parseInt(nums[1]);
        int min = multiplier + addition;
        int max = multiplier * die + addition;

        System.out.println((min + max) / 2.0);
    }
}
