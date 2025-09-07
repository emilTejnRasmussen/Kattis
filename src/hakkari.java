import java.util.Scanner;

public class hakkari
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int chars = sc.nextInt();
        sc.nextLine();
        int mines = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < lines; i++)
        {
            String line = sc.nextLine();
            for (int j = 0; j < chars; j++)
            {
                if (line.charAt(j) == '*')
                {
                    mines++;
                    s.append(String.format("%d %d\n", i + 1, j + 1));
                }
            }
        }
        System.out.println(mines);
        System.out.println(s);

    }
}
