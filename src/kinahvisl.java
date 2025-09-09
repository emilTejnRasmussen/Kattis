import java.util.Scanner;

public class kinahvisl
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int kids = 1;
        char[] name1 = sc.nextLine().toCharArray();
        char[] name2 = sc.nextLine().toCharArray();

        for (int i = 0; i < name1.length; i++)
        {
           if (!(name1[i] == name2[i])){
               kids++;
           }
        }
        System.out.println(kids);
    }
}
