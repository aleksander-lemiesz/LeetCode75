import java.util.Stack;

public class RmStarString {
    public String removeStars(String s) {
        var stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*')
                stack.add(s.charAt(i));
            else
                stack.pop();
        }

        var res = new StringBuilder();
        for (Character c : stack) {
            res.append(c);
        }

        return res.toString();
    }
}
