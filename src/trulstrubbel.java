import java.util.Scanner;

public class trulstrubbel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String score = sc.nextLine();
        int hScore = 0, tScore = 0;
        for (char c : score.toCharArray()){
            if (c == 'H'){
                hScore++;
            }
            if (c == 'T'){
                tScore++;
            }
            if ((hScore >= 11 || tScore >= 11) && Math.abs(hScore-tScore) >=2){
                tScore = 0;
                hScore = 0;
            }
        }
        System.out.printf("%d-%d\n", tScore, hScore);
    }
}
