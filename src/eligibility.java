import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class eligibility
{
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int testCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCases; i++)
        {
            Contestant contestant = createContestant();
            System.out.println(contestant.getName());
            System.out.println(contestant.getDayOfBirth());
            System.out.println(contestant.getStartedPostSecondaryStudies());
            System.out.println(contestant.getCourses());
        }


    }

    private static Contestant createContestant()
    {
        String[] input = sc.nextLine().split(" ");
        LocalDate studiesStartedDate = getLocalDate(input[1]);
        LocalDate dateOfBirth = getLocalDate(input[2]);

        return new Contestant(input[0], dateOfBirth, studiesStartedDate, Integer.parseInt(input[3]));
    }

    private static LocalDate getLocalDate(String date)
    {
        return LocalDate.of(
                Integer.parseInt(date.substring(0, 4)),
                Month.valueOf(getMonth(date.substring(5, 6))),
                Integer.parseInt(date.substring(7)));
    }

    private static String getMonth(String substring)
    {
        return null;
    }


    public static class Contestant{
        private String name;
        private LocalDate dayOfBirth;
        private LocalDate startedPostSecondaryStudies;
        private int Courses;

        public Contestant(String name, LocalDate dayOfBirth, LocalDate startedPostSecondaryStudies, int courses)
        {
            this.name = name;
            this.dayOfBirth = dayOfBirth;
            this.startedPostSecondaryStudies = startedPostSecondaryStudies;
            this.Courses = courses;
        }

        public String getName()
        {
            return name;
        }

        public LocalDate getDayOfBirth()
        {
            return dayOfBirth;
        }

        public LocalDate getStartedPostSecondaryStudies()
        {
            return startedPostSecondaryStudies;
        }

        public int getCourses()
        {
            return Courses;
        }
    }
}
