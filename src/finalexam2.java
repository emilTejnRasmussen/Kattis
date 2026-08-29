import java.util.Scanner;

public class finalexam2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        int questions = sc.nextInt();
        String answer = sc.nextLine();
        int score = 0;

        for (int i = 0; i < questions; i++)
        {
            String nextAnswer = sc.nextLine();
            if (answer.equals(nextAnswer)) score++;

            answer = nextAnswer;
        }

        System.out.println(score);
    }
}
