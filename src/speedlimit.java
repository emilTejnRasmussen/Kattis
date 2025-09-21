import java.util.Scanner;

public class speedlimit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true){
            int logs = sc.nextInt(), currentTime = 0, miles = 0, allTime = 0;
            if (logs == -1){break;}

            for (int i = 0; i < logs; i++)
            {
                int log = sc.nextInt(), time = sc.nextInt();
                currentTime = time - allTime;
                allTime = time;
                miles += log * currentTime;
            }
            System.out.println(miles + " miles");
        }
    }
}
