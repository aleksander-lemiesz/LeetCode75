public class ReverseWords {
    public String reverseWords(String s) {
        var words = s.split(" ");
        var result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (i != words.length - 1)
                    result.append(" ");
                result.append(words[i]);
            }
        }
        return result.toString();
    }
}
