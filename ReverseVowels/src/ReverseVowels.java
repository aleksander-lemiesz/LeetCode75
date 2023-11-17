public class ReverseVowels {
    public String reverseVowels(String s) {
        var result = new StringBuilder();

        String vow = getVowels(s);
        int j = vow.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            var c = Character.toLowerCase(s.charAt(i));
            if (isVowel(c)) {
                result.append(vow.charAt(j));
                j--;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    private String getVowels(String s) {
        var vowels = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            var c = Character.toLowerCase(s.charAt(i));
            if (isVowel(c)) {
                vowels.append(s.charAt(i));
            }
        }
        return vowels.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
