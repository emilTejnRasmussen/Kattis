import java.util.Scanner;

public class atmmaintenance
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), total = 0;

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            if(total + num > k){
                res.append(0);
                continue;
            }
            res.append(1);
            total += num;
        }
        System.out.println(res);
    }
}
