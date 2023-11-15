import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var greatest = 0;
        for (int kid : candies) {
            if (kid > greatest)
                greatest = kid;
        }
        var result = new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatest)
                result[i] = true;
            else
                result[i] = false;
        }
        return Arrays.asList(result);
    }
}
