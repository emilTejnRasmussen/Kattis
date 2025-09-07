import java.util.Scanner;

public class lvable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String why = sc.nextLine();
        String word = sc.nextLine();
        if (word.contains("lv"))
        {
            System.out.println(0);
        } else if (word.contains("l") || word.contains("v")) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
