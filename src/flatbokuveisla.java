import java.util.Scanner;

public class flatbokuveisla
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int slices = Integer.parseInt(sc.nextLine());
        int people = Integer.parseInt(sc.nextLine());
        System.out.println((slices % people));
    }
}
