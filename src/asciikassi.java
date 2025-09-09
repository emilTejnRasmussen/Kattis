import java.util.Scanner;

public class asciikassi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder horizontal = new StringBuilder();
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < size; i++)
        {
            horizontal.append("-");
            spaces.append(" ");
        }

        System.out.println("+" + horizontal + "+");
        for (int i = 0; i < size; i++)
        {
            System.out.println("|" + spaces + "|");
        }
        System.out.println("+" + horizontal + "+");
    }
}
