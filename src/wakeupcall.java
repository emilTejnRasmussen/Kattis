import java.util.Scanner;

public class wakeupcall
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int line1 = sc.nextInt(), line2 = sc.nextInt();
        int sum1 = 0, sum2 =0;
        for (int i = 0; i < line1; i++)
        {
            sum1 += sc.nextInt();
        }
        for (int i = 0; i < line2; i++)
        {
            sum2 += sc.nextInt();
        }

        if (sum1>sum2){
            System.out.println("Button 1");
        } else if (sum1<sum2) {
            System.out.println("Button 2");
        }else {
            System.out.println("Oh no");
        }
    }
}
