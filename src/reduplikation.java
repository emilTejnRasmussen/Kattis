import java.util.Scanner;

public class reduplikation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int times = Integer.parseInt(sc.nextLine());

        System.out.println(new StringBuilder().repeat(word, times));
    }
}
