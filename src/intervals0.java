import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class intervals0
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        List<Stream> streams = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            streams.add(new Stream(start, end));
        }

        int totalCount = 0;
        for (int i = 0; i < 24; i++)
        {
            int count = 0;
            for (Stream s : streams) {
                if (s.isInHour(i)){
                    count++;
                }
            }
            if (count >= k) totalCount++;
        }
        System.out.println(totalCount);
    }

    public static class Stream {
        private int start;
        private int end;
        public Stream(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isInHour(int hourOfDay) {
            return start <= hourOfDay && hourOfDay < end;
        }

    }
}
