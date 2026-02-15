import java.util.Scanner;

public class coffeecupcombo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lectures = Integer.parseInt(sc.nextLine());
        String schedule = sc.nextLine();

        int count = 0, lecturesNotAwake = 0;
        for (int i = 0; i < lectures; i++)
        {
            if (schedule.charAt(i) == '1') count = 2;
            else {
                if (count == 0) lecturesNotAwake++;
                else count--;
            }
        }
        System.out.println(lectures - lecturesNotAwake);
    }
}
