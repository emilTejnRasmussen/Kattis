import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class translation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        sc.nextLine();

        String sentence = sc.nextLine();
        int translations = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < translations; i++)
        {
               String swedish = sc.next();
               String english = sc.next();
               dictionary.put(swedish, english);
        }

        for (String word : sentence.split(" ")){
            System.out.print(dictionary.get(word) + " ");
        }
    }
}
