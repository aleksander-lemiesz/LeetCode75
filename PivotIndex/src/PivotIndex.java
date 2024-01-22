import java.util.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int rightSum = Arrays.stream(nums).sum() - nums[0];
        int leftSum = 0;
        if (leftSum == rightSum) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            rightSum -= nums[i];
            leftSum += nums[i - 1];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
