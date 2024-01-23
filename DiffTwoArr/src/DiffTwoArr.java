import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffTwoArr {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = arrToSet(nums1);
        var set2 = arrToSet(nums2);
        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<Integer>();

        for (int e : set1) {
            if (!set2.contains(e))
                list1.add(e);
        }
        for (int e : set2) {
            if (!set1.contains(e))
                list2.add(e);
        }

        var result = new ArrayList<List<Integer>>();
        result.add(list1);
        result.add(list2);
        return result;
    }

    private Set<Integer> arrToSet(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int e : nums) {
            set.add(e);
        }
        return set;
    }
}
