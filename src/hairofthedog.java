import java.util.Scanner;

public class hairofthedog
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        boolean isDrunk = false;
        int daysHungover = 0;

        for (int i = 0; i < days; i++)
        {
            String status = sc.nextLine();
            if (isDrunk && status.equals("sober")){
                isDrunk = false;
                daysHungover++;
            }
            if (status.equals("drunk") && !isDrunk){
                isDrunk = true;
            }
        }
        System.out.println(daysHungover);
    }
}
