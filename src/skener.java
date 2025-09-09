import java.util.Scanner;

public class skener
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), zr = sc.nextInt(), zc = sc.nextInt(); sc.nextLine();
        StringBuilder lines = new StringBuilder();

        for (int i = 0; i < r; i++)
        {
            for (char ch : sc.nextLine().toCharArray()){
                lines.repeat(ch, zc);

            }
            for (int j = 0; j < zr; j++)
            {
                System.out.println(lines);
            }

            lines = new StringBuilder();
        }

    }
}
