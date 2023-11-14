public class GreatestStringDivisor {
    public String gcdOfStrings(String str1, String str2) {
        String comb1 = str1 + str2;
        String comb2 = str2 + str1;
        if (!comb1.equals(comb2))
            return "";
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    private int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x%y);
    }
}
