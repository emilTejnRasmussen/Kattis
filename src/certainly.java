import java.util.Scanner;

public class certainly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++)
        {
            if (input.startsWith("certainly", i)) count++;
        }

        System.out.println(count);
    }
}
