import java.util.Scanner;

public class bijele
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] required = {1,1,2,2,2,8};
        int[] current = new int[6];
        for (int i = 0; i < 6; i++)
        {
            current[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++)
        {
            System.out.printf("%s ", required[i] - current[i]);
        }
    }
}
