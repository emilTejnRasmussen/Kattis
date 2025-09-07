import java.util.Scanner;

public class spritt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int classRooms = sc.nextInt();
        int bottles = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < classRooms; i++)
        {
            sum += sc.nextInt();
        }
        if (bottles>=sum){
            System.out.println("Jebb");
        } else{
            System.out.println("Neibb");
        }
    }
}
