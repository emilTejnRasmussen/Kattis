import java.util.Scanner;

public class blackthorn
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.contains("kth")){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
