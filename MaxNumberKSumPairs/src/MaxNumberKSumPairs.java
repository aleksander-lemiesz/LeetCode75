import java.util.Arrays;

public class MaxNumberKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int pairs_num = 0;
        while (start < end) {
            if (nums[start] + nums[end] == k) {
                start++;
                end--;
                pairs_num++;
            } else {
                if (nums[start] + nums[end] < k) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return pairs_num;
    }
}
