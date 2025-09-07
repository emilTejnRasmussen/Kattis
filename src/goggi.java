import java.util.Scanner;

public class goggi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[3];
        input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);
        if (a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else{
            System.out.println("goggi svangur!");
        }
    }
}
