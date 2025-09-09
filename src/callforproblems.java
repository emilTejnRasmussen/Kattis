import java.util.Scanner;

public class callforproblems
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int rule = sc.nextInt();
        for (int i = 0; i < rule; i++)
        {
            if (!(sc.nextInt() % 2 ==0)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
