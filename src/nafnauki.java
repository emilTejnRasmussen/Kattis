import java.util.Scanner;

public class nafnauki
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        System.out.println(file.substring(file.lastIndexOf(".")));
    }
}
