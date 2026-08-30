import java.util.Scanner;

public class virus3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String f = sc.nextLine();
        String h = sc.nextLine();

        int i = 0;

        for (int j = 0; j < h.length(); j++) {
            if (i < f.length() && f.charAt(i) == h.charAt(j)) {
                i++;
            }
        }

        if (i == f.length()) {
            System.out.println("Ja");
        } else {
            System.out.println("Nej");
        }
    }
}
