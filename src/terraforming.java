import java.util.Scanner;

public class terraforming
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int changes = Integer.parseInt(sc.nextLine());
        int water = 0;
        int oxygen = 0;
        int temp = -30;

        for (int i = 0; i < changes; i++)
        {
            String[] change = sc.nextLine().split(" \\+");
            switch (change[0]){
                case "ocean" -> water += Integer.parseInt(change[1]);
                case "oxygen" -> oxygen += Integer.parseInt(change[1]);
                case "temperature" -> temp += Integer.parseInt(change[1]);
            }
        }

        if (water >= 9 && oxygen >= 14 && temp >= 8) System.out.println("liveable");
        else System.out.println("not liveable");
    }
}
