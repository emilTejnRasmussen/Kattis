import java.util.Scanner;

public class skruop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int volume = 7, inputs = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < inputs; i++)
        {
            String change = sc.nextLine();
            if (change.equals("Skru op!") && volume < 10){
                volume++;
            } else if (change.equals("Skru ned!") && volume > 0){
                volume--;
            }
        }
        System.out.println(volume);
    }
}
