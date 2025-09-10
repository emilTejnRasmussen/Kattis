import java.util.Scanner;

public class basketballoneonone
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] score = sc.nextLine().split("");
        int scoreA =0, scoreB = 0;
        boolean isA = true;
        for (String goal : score){
            if (goal.equals("A")){
                isA = true;
            } else if (goal.equals("B")){
                isA = false;
            } else {
                if (isA){
                    scoreA++;
                }
                else {
                    scoreB++;
                }
            }
        }
        if (scoreA < scoreB){
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
