import java.util.Scanner;

public class titlecost
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int len = input[0].length();
        double other = Double.parseDouble(input[1]);
        if (len < other){
            System.out.println(len);
            return;
        }
        System.out.println(other);
    }
}
