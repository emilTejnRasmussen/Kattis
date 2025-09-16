import java.util.Scanner;

public class nostragglers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0, movements = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < movements; i++)
        {
            String[] movement = sc.nextLine().split(" ");
            int amount = Integer.parseInt(movement[2]);
            if (movement[1].equals("IN"))
            {
                count += amount;
            } else
            {
                if (count - amount >= 0)
                {
                    count -= Integer.parseInt(movement[2]);
                }
            }
        }
        if (count == 0){
            System.out.println("NO STRAGGLERS");
        } else {
            System.out.println(count);
        }
    }
}
