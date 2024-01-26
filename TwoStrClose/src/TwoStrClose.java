import java.util.Arrays;

public class TwoStrClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        var fr1 = makeFrequencyArray(word1);
        var fr2 = makeFrequencyArray(word2);

        if (!containsSameLetters(fr1, fr2))
            return false;

        return doesNotHaveSameNbrOfLetters(fr1, fr2);
    }

    private int[] makeFrequencyArray(String word) {
        var fr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            fr[word.charAt(i) - 'a']++;
        }
        return fr;
    }

    private boolean containsSameLetters(int[] fr1, int[] fr2) {
        for (int i = 0; i < fr1.length; i++) {
            if (fr1[i] == 0 && fr2[i] != 0 || fr1[i] != 0 && fr2[i] == 0)
                return false;
        }
        return true;
    }

    private boolean doesNotHaveSameNbrOfLetters(int[] fr1, int[] fr2) {
        Arrays.sort(fr1);
        Arrays.sort(fr2);
        for (int i = 0; i < fr1.length; i++) {
            if (fr1[i] != fr2[i])
                return false;
        }
        return true;
    }
}
