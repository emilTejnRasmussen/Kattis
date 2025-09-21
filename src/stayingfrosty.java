import java.util.Scanner;

public class stayingfrosty
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt(), potions = sc.nextInt();
        if (( 1.0 * dist/2) <= potions * 180){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
