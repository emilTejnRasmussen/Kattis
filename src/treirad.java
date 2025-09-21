import java.util.Scanner;

public class treirad
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 1, n = sc.nextInt();

        while (true) {
            if (count * (count + 1) * (count + 2) < n){
                count++;
            } else {
                break;
            }
        }
        System.out.println(count - 1);
    }
}
