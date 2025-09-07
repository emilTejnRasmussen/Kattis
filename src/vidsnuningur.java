import java.util.Scanner;

public class vidsnuningur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(new StringBuilder(line).reverse().toString());
    }
}
