import java.util.Scanner;

public class skitraffic
{
    private static int hours;
    private static int minutes;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] initialTime = sc.nextLine().split(":");
        hours = Integer.parseInt(initialTime[0]);
        minutes = Integer.parseInt(initialTime[1]);

        String dayOfWeek = sc.nextLine();
        if (dayOfWeek.equals("sat") || dayOfWeek.equals("sun")){
            doubleTime(2);
        }
        if (sc.nextLine().equals("1")) doubleTime(2);
        if (sc.nextLine().equals("1")) doubleTime(3);
        if (sc.nextLine().equals("1")) doubleTime(3);

        String rsMinutes = minutes > 9 ? minutes + "" : "0" + minutes;

        System.out.printf("%s:%s%n", hours, rsMinutes);

    }

    private static void doubleTime(int times)
    {
        minutes *= times;
        hours *= times;

        while(minutes > 59){
            int diff = minutes - 60;
            hours++;
            minutes = diff;
        }
    }
}
