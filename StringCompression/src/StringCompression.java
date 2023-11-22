public class StringCompression {
    public int compress(char[] chars) {
        var s = new StringBuilder();
        int cur_len = 0;
        char current = chars[0];
        for (char c : chars) {
            if (current != c) {
                s.append(current);
                if (cur_len > 1)
                    s.append(cur_len);
                current = c;
                cur_len = 0;
            }
            cur_len++;
        }
        s.append(current);
        if (cur_len > 1)
            s.append(cur_len);
        char[] compr = s.toString().toCharArray();
        for (int i = 0; i < compr.length; i++) {
            chars[i] = compr[i];
        }
        return compr.length;
    }
}
