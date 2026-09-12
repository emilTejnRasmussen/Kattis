import java.util.*;

public class compoundwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = new ArrayList<>();
        Set<String> results = new TreeSet<>();

        while (sc.hasNext()) {
            words.add(sc.next());
        }

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (i != j) {
                    results.add(words.get(i) + words.get(j));
                }
            }
        }

        for (String word : results) {
            System.out.println(word);
        }
    }
}