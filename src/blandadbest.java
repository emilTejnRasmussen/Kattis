import java.util.Scanner;

public class blandadbest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        if (amount >1) {
            if (s.equals(sc.nextLine())){
                System.out.println(s);
            } else {
                System.out.println("blandad best");
            }
        }
        else {
            System.out.println(s);
        }
    }
}
