import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cypherdecypher
{
    private static Map<Character, Integer> alphToNum = new HashMap<>();
    private static Map<Integer, Character> numToAlph = new HashMap<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        populateMap();

        for (int i = 0; i < n; i++)
        {
            String input = sc.nextLine();
            printEncryptedValue(input, key);
        }

    }

    private static void printEncryptedValue(String input, String key)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++)
        {
            int charVal = alphToNum.get(input.charAt(i));
            charVal *= Integer.parseInt(key.substring(i,i+1));
            sb.append(getCharFromInt(charVal));
        }
        System.out.println(sb);
    }

    private static char getCharFromInt(int charVal)
    {
        while (charVal > 25){
            charVal -= 26;
        }

        return numToAlph.get(charVal);
    }

    private static void populateMap()
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <= 25; i++)
        {
            alphToNum.put(alphabet.charAt(i), i);
            numToAlph.put(i, alphabet.charAt(i));
        }
    }
}
