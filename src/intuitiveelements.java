import java.util.Scanner;

public class intuitiveelements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cases; i++)
        {
            String first = sc.nextLine();
            boolean isGood = true;
            for (char letter : sc.nextLine().toCharArray()){
                if (!first.contains(letter + "")){
                    isGood = false;
                    break;
                }
            }
            if (isGood)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
