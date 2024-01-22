public class LongSubOnesDel {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int erasedZero = 0;
        while (end < nums.length) {
            if (nums[end] == 0) {
                erasedZero++;
            }
            end++;
            if (erasedZero > 1) {
                if (nums[start] == 0) {
                    erasedZero--;
                }
                start++;
            }
        }
        return end - start - 1;
    }
}
