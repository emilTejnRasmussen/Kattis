import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class revpolishtoinfixeasy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] tokens = line.trim().split("\\s+");
        Deque<String> st = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)){
                String right = st.pop();
                String left = st.pop();

                st.push("(" + left + token + right + ")");
            } else {
                st.push(token);
            }
        }
        System.out.println(st.pop());
    }

    private static boolean isOperator(String s) {
        return s.length() == 1 && "+-*/".indexOf(s.charAt(0)) >= 0;
    }
}
