import java.util.Scanner;

public class skammstofun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int words = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < words; i++)
        {
            char letter = sc.next().charAt(0);
            if (Character.isUpperCase(letter)){
                System.out.print(letter);
            }
        }
    }
}
