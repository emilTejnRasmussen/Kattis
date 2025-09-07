import java.util.Scanner;

public class aldur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int friendsAmount = sc.nextInt();
        int youngest = sc.nextInt();
        for (int i = 0; i < friendsAmount -1; i++)
        {
            youngest = Math.min(youngest, sc.nextInt());
        }
        System.out.println(youngest);
    }
}
