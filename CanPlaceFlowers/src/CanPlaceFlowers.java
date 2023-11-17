public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length && n > 0) {
            if (flowerbed[i] == 1)
                i++;
            else if (flowerbed[i] == 0 && flowerbed[Math.max(i-1, 0)] == 0
                    && flowerbed[Math.min(i+1, flowerbed.length - 1)] == 0) {
                n--;
                flowerbed[i] = 1;
            }
            i++;
        }
        return n == 0;
    }
}
