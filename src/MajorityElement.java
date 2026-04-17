import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(nums));
    }

    public static int majorityElement(int[] nums) {
        int mid = nums.length / 2;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num: nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
            if (numsMap.get(num) > mid) {
                return num;
            }
        }
        System.out.println(numsMap);
        return -1;
    }

    public static int majorityElement2(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int num: nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count ++;
            } else {
                count --;
            }
        }
        count = 0;
        for (int num: nums) {
            if (num == candidate) {
                count ++;
            }
        }
        if (count > nums.length / 2) {
            return candidate;
        }
        return -1;
    }

}
