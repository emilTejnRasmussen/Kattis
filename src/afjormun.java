import java.util.Scanner;

public class afjormun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lines; i++)
        {
            String line = sc.nextLine();
            System.out.println(line.substring(0,1).toUpperCase() + line.substring(1).toLowerCase());
        }
    }
}
