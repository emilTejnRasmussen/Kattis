import java.util.Scanner;

public class everyotherletter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++)
        {
            if (i % 2 == 0) sb.append(word.charAt(i));
        }

        System.out.println(sb);
    }
}
