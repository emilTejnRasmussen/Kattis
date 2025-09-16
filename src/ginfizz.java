import java.util.Scanner;

public class ginfizz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numOfGinFiz = sc.nextInt();
        System.out.println((45 * numOfGinFiz) + " ml gin");
        System.out.println((30 * numOfGinFiz) + " ml fresh lemon juice");
        System.out.println((10 * numOfGinFiz) + " ml simple syrup");
        if (numOfGinFiz > 1)
        {
            System.out.println((numOfGinFiz) + " slices of lemon");
        } else
        {
            System.out.println((numOfGinFiz) + " slice of lemon");
        }

    }
}
