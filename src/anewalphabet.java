import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anewalphabet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<Character, String> newAlphabet = new HashMap<>(Map.ofEntries(
                Map.entry('a', "@"),
                Map.entry('b', "8"),
                Map.entry('c', "("),
                Map.entry('d', "|)"),
                Map.entry('e', "3"),
                Map.entry('f', "#"),
                Map.entry('g', "6"),
                Map.entry('h', "[-]"),
                Map.entry('i', "|"),
                Map.entry('j', "_|"),
                Map.entry('k', "|<"),
                Map.entry('l', "1"),
                Map.entry('m', "[]\\/[]"),
                Map.entry('n', "[]\\[]"),
                Map.entry('o', "0"),
                Map.entry('p', "|D"),
                Map.entry('q', "(,)"),
                Map.entry('r', "|Z"),
                Map.entry('s', "$"),
                Map.entry('t', "']['"),
                Map.entry('u', "|_|"),
                Map.entry('v', "\\/"),
                Map.entry('w', "\\/\\/"),
                Map.entry('x', "}{"),
                Map.entry('y', "`/"),
                Map.entry('z', "2"),
                Map.entry(' ', " ")
        ));

        String input = sc.nextLine().toLowerCase();

        for (char c : input.toCharArray()) {
            if (newAlphabet.get(c) == null) System.out.print(c);
            else System.out.print(newAlphabet.get(c));
        }
    }
}
