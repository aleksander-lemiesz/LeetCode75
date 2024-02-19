import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> q = new LinkedList<Integer>();
    private final static int timeout = 3000;

    public RecentCounter() {
    }

    public int ping(int t) {
        q.add(t);

        while (q.peek() < t - timeout) {
            q.poll();
        }

        return q.size();
    }
}
