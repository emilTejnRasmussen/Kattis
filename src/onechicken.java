import java.util.Scanner;

public class onechicken
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numOfPeople = sc.nextInt();
        int piecesOfChicken = sc.nextInt();
        int difference = Math.abs(numOfPeople - piecesOfChicken);

        String piece = difference == 1 ? "piece" : "pieces";

        if (piecesOfChicken > numOfPeople) System.out.printf("Dr. Chaz will have %d %s of chicken left over!", difference, piece);
        else {
            System.out.printf("Dr. Chaz needs %d more %s of chicken!", difference, piece);
        }

    }
}
