import java.util.Scanner;

public class triangelfabriken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 90 || b == 90 || c == 90) {
            System.out.println("Ratvinklig Triangel"); // Right triangle
        } else if (a > 90 || b > 90 || c > 90) {
            System.out.println("Trubbig Triangel");   // Obtuse triangle
        } else {
            System.out.println("Spetsig Triangel");   // Acute triangle
        }
    }
}