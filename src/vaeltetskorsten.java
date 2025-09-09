import java.util.Scanner;

public class vaeltetskorsten
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int mBp = 0;
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            int newMBp = sc.nextInt();
            if (sc.nextLine().trim().equals("nej") && newMBp > mBp)
            {
                mBp = newMBp;
            }
        }
        System.out.println(mBp);
    }
}
