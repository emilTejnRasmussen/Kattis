import java.util.Scanner;

public class lamppostrace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lampPosts = sc.nextInt(), lastLampPost = 0;
        int metersTraveled = 0;

        for (int i = 0; i < lampPosts; i++)
        {
            int metersFromStart = sc.nextInt();
            metersTraveled += Math.abs(metersFromStart - lastLampPost);
            lastLampPost = metersFromStart;
        }

        System.out.println(metersTraveled);
    }
}
