public class MaxConOnes3 {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;
        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
            end++;
        }
        return end - start;
    }
}
