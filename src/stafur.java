import java.util.Scanner;

public class stafur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().toUpperCase().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            System.out.println("Jebb");
        } else if (c =='Y')
        {
            System.out.println("Kannski");
        } else {
            System.out.println("Neibb");
        }
    }
}
