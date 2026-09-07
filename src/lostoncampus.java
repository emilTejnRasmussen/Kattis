import java.util.*;

public class lostoncampus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cols = sc.nextInt();
        int rows = sc.nextInt();

        char[][] grid = new char[rows][cols];
        int[][] best = new int[rows][cols];

        Pos start = null;
        List<Pos> ends = new ArrayList<>();

        for (int row = 0; row < rows; row++)
        {
            grid[row] = sc.next().toCharArray();

            for (int col = 0; col < cols; col++)
            {
                best[row][col] = Integer.MAX_VALUE;
                if (grid[row][col] == '*')
                {
                    start = new Pos(row, col);
                } else if (grid[row][col] == 'E')
                {
                    ends.add(new Pos(row, col));
                }
            }
        }

        Deque<Pos> queue = new ArrayDeque<>();
        queue.add(start);
        best[start.row()][start.col()] = 0;

        while (!queue.isEmpty())
        {
            Pos current = queue.removeFirst();

            for (Direction direction : Direction.values())
            {
                Pos next = current.add(direction.offset());
                if (next.row() < 0 || next.row() >= rows || next.col() < 0 || next.col() >= cols) continue;

                char tile = grid[next.row()][next.col()];
                if (tile == '#') continue;

                int nextCost = best[current.row()][current.col()];

                if (tile == 'D') nextCost++;

                if (nextCost < best[next.row()][next.col()])
                {
                    best[next.row()][next.col()] = nextCost;

                    if (tile == 'D') queue.addLast(next);
                    else queue.addFirst(next);
                }


            }
        }

        int answer = Integer.MAX_VALUE;

        for (Pos exit : ends){
            int doorAmount = best[exit.row()][exit.col()];
            if (doorAmount < answer) answer = doorAmount;
        }
        if (answer == Integer.MAX_VALUE) System.out.println("NOT POSSIBLE");
        else System.out.println(answer);
    }
}

record Pos(int row, int col)
{
    public Pos add(Pos other) {
        return new Pos(
                row + other.row,
                col + other.col
        );
    }
}

enum Direction
{
    UP(new Pos(-1, 0)),
    DOWN(new Pos(1, 0)),
    LEFT(new Pos(0, -1)),
    RIGHT(new Pos(0, 1));

    private final Pos offset;

    Direction(Pos offset)
    {
        this.offset = offset;
    }

    public Pos offset()
    {
        return offset;
    }
}
