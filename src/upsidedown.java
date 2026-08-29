import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class upsidedown
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        List<String> words = new ArrayList<>();
        int amount = sc.nextInt();

        for (int i = 0; i < amount; i++)
        {
            words.add(reverse(sc.next()));
        }
        words = words.stream().sorted().toList();

        for (String word : words.reversed()){
            System.out.print(word + " ");
        }
    }

    private static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
