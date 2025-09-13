import java.util.Scanner;

public class helpaphd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++)
        {
            String problem = sc.nextLine();
            if (problem.contains("+")){
                int a = Integer.parseInt(problem.substring(0, problem.indexOf("+")));
                int b = Integer.parseInt(problem.substring(problem.indexOf("+") + 1));
                System.out.println(a+b);
            } else {
                System.out.println("skipped");
            }
        }
    }
}
