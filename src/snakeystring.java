import java.util.Scanner;
import java.util.stream.IntStream;

public class snakeystring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt(); sc.nextLine();
        char[] cols = new char[c];

        for (int i = 0; i < r; i++)
        {
            String line = sc.nextLine();
            IntStream.range(0,c).forEach(j -> {
                char c_in = line.charAt(j);
                if (c_in != '.') cols[j] = c_in;
            });
        }

        for (char c_out : cols) System.out.print(c_out);
    }
}
