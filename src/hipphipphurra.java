import java.util.Scanner;

public class hipphipphurra
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int amount = sc.nextInt();
        String result = String.format("Hipp hipp hurra, %s!\n", name);
        System.out.println(new StringBuilder().repeat(result, amount));
    }
}
