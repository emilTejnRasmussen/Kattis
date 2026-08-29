import java.util.*;

public class carracing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int races = sc.nextInt();
        RaceManager raceManager = new RaceManager();

        for (int i = 0; i < races; i++)
        {
            raceManager.addEntry(new Entry(sc.nextInt(), sc.nextInt()));
        }

        Entry entry = raceManager.getBestCar();

        System.out.println(entry.getCarNumber());
        System.out.println(entry.getPlacementAVG());
    }

    static class RaceManager{
        private final List<Entry> entries;

        public RaceManager()
        {
            this.entries = new ArrayList<>();
        }

        public void addEntry(Entry entry){
            if (entries.contains(entry)) {
                entries.get(entries.indexOf(entry)).addRace(entry.getPlacementAVG());
            } else {
              entries.add(entry);
            }
        }

        public Entry getBestCar() {
            return entries.stream()
                    .min(Comparator.comparingInt(Entry::getPlacementAVG))
                    .orElse(null);
        }
    }

    static class Entry {
        private final int carNumber;
        private int placementSum;
        private int races;

        public Entry(int carNumber, int placement) {
            this.carNumber = carNumber;
            this.placementSum = placement;
            this.races = 1;
        }

        public void addRace(int placement) {
            placementSum += placement;
            races++;
        }

        public int getCarNumber() {
            return carNumber;
        }

        public int getPlacementAVG() {
            return placementSum / races;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return carNumber == entry.carNumber;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(carNumber);
        }
    }
}
