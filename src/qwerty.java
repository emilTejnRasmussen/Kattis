import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class qwerty
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        List<String> letters = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
        StringBuilder message = new StringBuilder();

        for (String letter: letters){
            message.append(getLetter(letter));
        }
        System.out.println(message);
    }

    private static String getLetter(String letter)
    {

        return switch (letter){
            case " " -> " ";
            case "a" -> "q";
            case "b" -> "w";
            case "c" -> "e";
            case "d" -> "r";
            case "e" -> "t";
            case "f" -> "y";
            case "g" -> "u";
            case "h" -> "i";
            case "i" -> "o";
            case "j" -> "p";
            case "k" -> "a";
            case "l" -> "s";
            case "m" -> "d";
            case "n" -> "f";
            case "o" -> "g";
            case "p" -> "h";
            case "q" -> "j";
            case "r" -> "k";
            case "s" -> "l";
            case "t" -> "z";
            case "u" -> "x";
            case "v" -> "c";
            case "w" -> "v";
            case "x" -> "b";
            case "y" -> "n";
            case "z" -> "m";
            default -> null;
        };
    }

}
