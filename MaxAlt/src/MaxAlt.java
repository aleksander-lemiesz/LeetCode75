public class MaxAlt {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxAlt = 0;
        for (int e : gain) {
            alt += e;
            maxAlt = Math.max(maxAlt, alt);
        }
        return maxAlt;
    }
}
