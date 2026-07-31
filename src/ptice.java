import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ptice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numOfQuestions = Integer.parseInt(sc.nextLine());
        String answers = sc.nextLine();

        Map<String, String> strategies = new HashMap<>();
        strategies.put("Adrian", "ABC");
        strategies.put("Bruno", "BABC");
        strategies.put("Goran", "CCAABB");

        Map<String, Integer> correctAnswers = new HashMap<>();
        correctAnswers.put("Adrian", 0);
        correctAnswers.put("Bruno", 0);
        correctAnswers.put("Goran", 0);

        for (int i = 0; i < numOfQuestions; i++)
        {
            char correctAnswer = answers.charAt(i);

            for (Map.Entry<String, String> entry : strategies.entrySet())
            {
                String name = entry.getKey();
                String strategy = entry.getValue();

                char guessedAnswer =
                        strategy.charAt(i % strategy.length());

                if (guessedAnswer == correctAnswer)
                {
                    correctAnswers.merge(name, 1, Integer::sum);
                }
            }
        }

        int highestScore = correctAnswers.values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println(highestScore);

        correctAnswers.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == highestScore)
                .map(Map.Entry::getKey)
                .sorted()
                .forEach(System.out::println);
    }
}