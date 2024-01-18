public class MaxVow {
    public int maxVowels(String s, int k) {
        int maxVow = 0;
        int curVow = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curVow++;
            }
        }
        maxVow = curVow;
        for (int i = 0; i < s.length() - k; i++) {
            if (isVowel(s.charAt(i))) {
                curVow--;
            }
            if (isVowel(s.charAt(i + k))) {
                curVow++;
            }
            maxVow = Math.max(maxVow, curVow);
        }
        return maxVow;
    }

    public boolean isVowel(char y) {
        return y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u';
    }
}
