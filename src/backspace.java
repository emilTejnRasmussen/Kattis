import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backspace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length - 1; i >= 0; i--)
        {
            char c = s[i];
            if (c == '<'){
                count++;
                continue;
            }

            if (!(count > 0)) {
                sb.append(c);
                continue;
            }
            count--;
        }
        System.out.println(sb.reverse());
    }
}
