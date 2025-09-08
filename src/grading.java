import java.util.Scanner;

public class grading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
        int score = sc.nextInt();
        String result = "";
        if (score >= a)
        {
            result = "A";
        } else if (score >= b)
        {
            result = "B";
        } else if (score >= c)
        {
            result = "C";
        } else if (score >= d)
        {
            result = "D";
        } else if (score >= e)
        {
            result = "E";
        } else {
            result = "F";
        }
        System.out.println(result);
    }
}
