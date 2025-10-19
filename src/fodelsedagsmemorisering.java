import java.util.*;

public class fodelsedagsmemorisering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Friend> birthdayMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int importance = sc.nextInt();
            String date = sc.next(); // "MM/DD"

            Friend current = birthdayMap.get(date);
            if (current == null || importance > current.importance) {
                birthdayMap.put(date, new Friend(name, importance));
            }
        }

        List<String> remembered = new ArrayList<>();
        for (Friend f : birthdayMap.values()) {
            remembered.add(f.name);
        }
        Collections.sort(remembered);

        System.out.println(remembered.size());
        for (String name : remembered) {
            System.out.println(name);
        }
    }
}

class Friend {
    String name;
    int importance;
    Friend(String name, int importance) {
        this.name = name;
        this.importance = importance;
    }
}
