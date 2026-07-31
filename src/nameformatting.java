import java.util.Arrays;
import java.util.Scanner;

public class nameformatting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] name = input.split(", ");


        System.out.printf("%s. %s",
                capitalize(name[1]).charAt(0),
                capitalize(name[0])
                );
    }

    private static String capitalize(String s)
    {
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
