class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        } else if (t.isEmpty()) {
            return false;
        }
        String l = "";
        String sh = "";
        if (s.length() > t.length()) {
            l = s;
            sh = t;
        } else {
            l = t;
            sh = s;
        }

        int lp = 0;
        int sp = 0;
        for (int i = 0; i < l.length(); i++) {
            if (sp < sh.length() && l.charAt(lp) == sh.charAt(sp)) {
                sp++;
            }
            lp++;
        }
        return sp == sh.length();
    }
}