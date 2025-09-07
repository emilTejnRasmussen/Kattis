import java.util.Scanner;

public class dagatal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month>7){
            month++;
        }
        if(month == 2){
            System.out.println(28);
        } else if (month %2==0)
        {
            System.out.println(30);
        } else {
            System.out.println(31);
        }
    }
}
