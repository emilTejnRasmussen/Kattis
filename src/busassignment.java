import java.util.Scanner;

public class busassignment
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int busStops = sc.nextInt(), sum = 0, res = 0;

        for (int i = 0; i < busStops; i++)
        {
            int out = sc.nextInt();
            int in = sc.nextInt();
            sum -= out; sum += in;
            if (sum > res){
                res = sum;
            }
        }
        System.out.println(res);
    }
}
