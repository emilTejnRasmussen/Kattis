import java.util.Scanner;

public class isyavowel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int countNoY = 0;
        int count = 0;

        for (char c : sc.nextLine().trim().toLowerCase().toCharArray())
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                countNoY++;
                count++;
            } else if (c == 'y')
            {
                count++;
            }
        }
        System.out.printf("%d %d", countNoY, count);
    }
}
