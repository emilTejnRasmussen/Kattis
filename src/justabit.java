import java.util.Scanner;

public class justabit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int zero = 0, one = 0;
        String input = sc.nextLine();
        for (char c : input.toCharArray())
        {
            if (c == '0') zero++;
            else one++;
        }
        System.out.printf("%d %d", zero, one);
    }
}
