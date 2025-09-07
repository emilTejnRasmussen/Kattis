import java.util.Scanner;

public class bestagjofin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        int fun = 0;
        String mostFun ="";
        for (int i = 0; i < amount; i++)
        {
            String[] s = sc.nextLine().split(" ");
            int n = Integer.parseInt(s[1]);
            if (fun < n){
               mostFun = s[0];
               fun = n;
            }
        }
        System.out.println(mostFun);
    }
}
