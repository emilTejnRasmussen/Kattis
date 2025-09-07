import java.util.Scanner;

public class takkar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int trump = sc.nextInt();
        int kim = sc.nextInt();
        if (trump>kim)
        {
            System.out.println("MAGA!");
        } else if (kim>trump){
            System.out.println("FAKE NEWS!");
        }   else {
            System.out.println("WORLD WAR 3!");
        }
    }
}
