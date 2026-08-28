import java.util.Scanner;

public class rockpaperscissors2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        boolean player1Wins = true;

        if (p1.equals(p2)) System.out.println("Draw");
        else{
            switch (p1){
                case "rock" -> player1Wins = p2.equals("scissors");
                case "scissors" -> player1Wins = p2.equals("paper");
                case "paper" -> player1Wins = p2.equals("rock");
            }
            System.out.println(player1Wins ? "Player 1" : "Player 2");
        }
    }
}
