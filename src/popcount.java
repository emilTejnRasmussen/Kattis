import java.util.Scanner;

public class popcount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String input = sc.nextLine();
        for (char c:input.toCharArray()){
            if (c == '1'){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
