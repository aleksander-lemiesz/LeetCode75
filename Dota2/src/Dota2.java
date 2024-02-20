import java.util.LinkedList;
import java.util.Queue;

public class Dota2 {
    private final static String RADIANT = "Radiant";
    private final static String DIRE = "Dire";
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQ = new LinkedList<Integer>();
        Queue<Integer> dQ = new LinkedList<Integer>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rQ.add(i);
            } else {
                dQ.add(i);
            }
        }

        while (!rQ.isEmpty() && !dQ.isEmpty()) {
            int r = rQ.poll();
            int d = dQ.poll();
            boolean b = r < d ? rQ.add(r + senate.length()) : dQ.add(d + senate.length());
        }

        return !rQ.isEmpty() ? RADIANT : DIRE;
    }
}
