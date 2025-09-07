import java.util.Scanner;

public class fjoldibokstafa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (char c : sc.nextLine().toLowerCase().toCharArray())
        {
            if (alphabet.contains(String.valueOf(c)))
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
