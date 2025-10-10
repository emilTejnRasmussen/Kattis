import java.util.Scanner;

public class kmh
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), lastSpeed = 0;sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            String input = sc.nextLine();
            if (input.equals("/")){
                System.out.println(((lastSpeed / 10) + 1) * 10);
            } else {
                int num = Integer.parseInt(input);
                if (num > lastSpeed){
                    lastSpeed = Integer.parseInt(input);
                }
                System.out.println(input);
            }
        }
    }
}
