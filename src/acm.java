import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class acm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Submission> submissions = new ArrayList<>();
        int totalProblemsSolved = 0;
        int totalTimeSpent = 0;

        while (true) {
            int m = sc.nextInt();
            if (m == -1) break;

            String problem = sc.next();
            boolean solved = sc.next().equals("right");

            Submission submission = getSubmissionOrCreateNew(submissions, problem);
            submission.addSubmission(m, solved);

        }

        for (Submission submission : submissions){
            if (submission.solved){
                totalTimeSpent += submission.getTimeSpent();
                totalProblemsSolved++;
            }
        }

        System.out.println(totalProblemsSolved + " " + totalTimeSpent);
    }

    private static Submission getSubmissionOrCreateNew(List<Submission> submissions, String problem)
    {
        for (Submission submission : submissions) {
            if (submission.getProblem().equals(problem)) {
                return submission;
            }
        }

        Submission submission = new Submission(problem);
        submissions.add(submission);
        return submission;
    }

    static class Submission {
        private final String problem;
        private boolean solved;
        private int wrongAttempts;
        private int timeSpent;

        public Submission(String problem) {
            this.problem = problem;
        }

        public void addSubmission(int time, boolean solved) {
            if (this.solved) return;

            if (solved) {
                this.solved = true;
                this.timeSpent = time + wrongAttempts * 20;
            } else {
                wrongAttempts++;
            }
        }

        public int getTimeSpent() {
            return timeSpent;
        }

        public String getProblem() {
            return problem;
        }

        public boolean isSolved() {
            return solved;
        }
    }
}
