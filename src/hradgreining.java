import java.util.Scanner;

public class hradgreining
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (word.toLowerCase().contains("cov")){
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }
    }
}
