import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class toktik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = Integer.parseInt(sc.nextLine());

        Map<String, Integer> views = new HashMap<>();

        for (int i = 0; i <inputCount; i++) {
            String name = sc.next();
            int viewCount = sc.nextInt();
            views.putIfAbsent(name, 0);
            views.put(name, views.get(name) + viewCount);
        }

        String rs = Collections.max(views.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(rs);
    }
}
