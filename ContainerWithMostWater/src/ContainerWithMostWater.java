public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxWater = 0;
        while (start != end) {
            int h = Math.min(height[start], height[end]);
            int w = end - start;
            if (h * w > maxWater) {
                maxWater = h * w;
            }
            if (h == height[start]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }
}
