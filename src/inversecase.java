import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class inversecase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            char letter = input.charAt(i);
            if (isUpperCase(letter)) sb.append(("" + letter).toLowerCase());
            else sb.append(("" + letter).toUpperCase());
        }

        System.out.println(sb);
    }
}
