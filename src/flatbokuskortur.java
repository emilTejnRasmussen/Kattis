import java.util.Scanner;

public class flatbokuskortur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double areaX = Math.pow(sc.nextInt()/2.0, 2) * Math.PI , areaY = Math.pow(sc.nextInt()/2.0, 2) * Math.PI, z = sc.nextInt();

        String answer = areaX > areaY * z ? "Neibb" : "Jebb";
        System.out.println(answer);
    }
}
