import java.util.Scanner;

public class whichnumberkindisit2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            StringBuilder result = new StringBuilder();
            int num = sc.nextInt();
            if (num % 2 != 0){
                result.append("O");
            }
            int root = (int) Math.sqrt(num);
            if (root * root == num) {
                result.append("S");
            }
            if (!result.isEmpty()){
                System.out.println(result);
            } else {
                System.out.println("EMPTY");
            }
        }
    }
}
