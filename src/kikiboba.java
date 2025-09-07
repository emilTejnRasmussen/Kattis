import java.util.Scanner;

public class kikiboba
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase().trim();
        int kCount = 0, bCount = 0;


        for (char c : word.toCharArray())
        {
            if (c == 'k')
            {
                kCount++;
            }
            if (c == 'b')
            {
                bCount++;
            }
        }
        if (kCount == 0 && bCount == 0)
        {
            System.out.println("none");
        }
        else if (kCount == bCount)
        {
            System.out.println("boki");
        } else if (kCount < bCount)
        {
            System.out.println("boba");
        } else if (kCount > bCount)
        {
            System.out.println("kiki");
        }
    }
}
