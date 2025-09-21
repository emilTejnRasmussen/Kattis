import java.util.Scanner;

public class upprodun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int classRooms = sc.nextInt(), contestants = sc.nextInt(), students = contestants/classRooms;
        int remainder = contestants % classRooms;

        for (int i = 0; i < (classRooms); i++)
        {
            if (remainder != 0){
                System.out.println(new String(new char[students + 1]).replace("\0", "*"));
                remainder--;
                continue;
            }
            System.out.println(new String(new char[students]).replace("\0", "*"));
        }
    }
}
