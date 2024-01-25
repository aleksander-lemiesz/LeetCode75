import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumOccur {
    public boolean uniqueOccurrences(int[] arr) {
        var map = new HashMap<Integer, Integer>();
        for (int e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }
        return map.values().size() == new HashSet<>(map.values()).size();
    }
}
