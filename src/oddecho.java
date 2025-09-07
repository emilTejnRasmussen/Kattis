import java.util.Scanner;

public class oddecho
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < amount; i++)
        {
            String word = sc.nextLine();
            if (i%2==0){
                System.out.println(word);
            }
        }
    }
}
