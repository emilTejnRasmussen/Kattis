import java.util.Scanner;

public class secondopinion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int seconds = input % 60;
        int minutes = (input / 60);
        int hours = minutes / 60;
        System.out.println(hours + " : " + (minutes % 60) + " : " + seconds);
    }
}
