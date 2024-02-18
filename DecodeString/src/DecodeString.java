import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        var stack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stack.push(String.valueOf(s.charAt(i)));

            } else {
                var substring = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    substring.insert(0, stack.pop());
                }
                stack.pop();

                var k = new StringBuilder();
                while (!stack.isEmpty() && isNumeric(stack.peek())) {
                    k.insert(0, stack.pop());
                }

                var tmp = new StringBuilder();
                int kTimes = 1;
                if (!k.toString().isEmpty()) {
                    kTimes = Integer.parseInt(k.toString());
                }
                for (int j = 0; j < kTimes; j++) {
                    tmp.append(substring);
                }
                stack.push(tmp.toString());
            }
        }

        var res = new StringBuilder();
        for (String str : stack) {
            res.append(str);
        }
        return res.toString();
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
