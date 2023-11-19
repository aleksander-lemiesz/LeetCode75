import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        int pre_suff = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= pre_suff;
            pre_suff *= nums[i];
        }
        pre_suff = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= pre_suff;
            pre_suff *= nums[i];
        }
        return result;
    }
}
