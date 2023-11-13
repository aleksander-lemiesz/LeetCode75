public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int shorterSize = Math.min(word1.length(), word2.length());
        int lengthDiff = word1.length() - word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (; i < shorterSize; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        while (lengthDiff < 0) {
            result.append(word2.charAt(i));
            i++;
            lengthDiff++;
        }
        while (lengthDiff > 0) {
            result.append(word1.charAt(i));
            i++;
            lengthDiff--;
        }
        return result.toString();
    }
}
