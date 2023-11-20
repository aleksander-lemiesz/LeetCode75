public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int max = Integer.MAX_VALUE;
        int low_max = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= low_max)
                low_max = num;
            else if (num <= max)
                max = num;
            else
                return true;
        }
        return false;
    }
}
