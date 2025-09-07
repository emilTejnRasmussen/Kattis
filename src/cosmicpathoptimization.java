import java.util.Scanner;

public class cosmicpathoptimization
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        double sum = 0d;
        for (int i = 0; i < m; i++)
        {
            sum += sc.nextInt();
        }
        System.out.println((int)Math.floor(sum/m));
    }
}
