import java.util.Scanner;

public class litagreining
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();
        boolean allEqual = r == g && r == b;

        if (g == 0 && allEqual) System.out.println("svartur");
        else if (g == 255 && allEqual) System.out.println("hvitur");
        else if (allEqual) System.out.println("grar");

        else if (r > g && r > b) System.out.println("raudur");
        else if (g > r && g > b) System.out.println("graenn");
        else if (b > r && b > g) System.out.println("blar");

        else if (r == g && b < r) System.out.println("gulur");
        else if (r == b && g < r) System.out.println("fjolubleikur");
        else if (g == b && r < b) System.out.println("blagraenn");

        else System.out.println("othekkt");
    }
}
