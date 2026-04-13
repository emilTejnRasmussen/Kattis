import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bookingaroom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt(), bookedRooms = sc.nextInt();

        if (rooms == bookedRooms) {
            System.out.println("too late");
            return;
        }

        Set<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= rooms; i++)
        {
            numbers.add(i);
        }

        for (int i = 0; i < bookedRooms; i++)
        {
            numbers.remove(sc.nextInt());
        }

        System.out.println(numbers.stream().findFirst().get());
    }
}
