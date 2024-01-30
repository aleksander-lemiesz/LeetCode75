import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqRowColPair {
    public int equalPairs(int[][] grid) {
        if (grid.length != grid[0].length)
            return 0;

        int size = grid.length;

        var rows = new HashMap<Integer, List<Integer>>();
        var cols = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < size; i++) {
            rows.put(i, new ArrayList<>(size));
            cols.put(i, new ArrayList<>(size));
        }

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                rows.get(r).add(grid[r][c]);
                cols.get(c).add(grid[r][c]);
            }
        }

        int res = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (rows.get(i).equals(cols.get(j)))
                    res++;
            }
        }

        return res;
    }
}
