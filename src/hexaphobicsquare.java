import java.util.Scanner;

public class hexaphobicsquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (true){
            num++;
            if (!containsSix(num * num)){
                System.out.println(num);
                break;
            }
        }
    }

    private static boolean containsSix(int i)
    {
        return  (i + "").contains("6");
    }
}
