public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen2(7, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int end = 0;
        int minSize = Integer.MAX_VALUE;
        while (end < nums.length) {
            sum += nums[end];
            end ++;
            while (sum >= target) {
                minSize = Math.min(minSize, end - start);
                sum -= nums[start];
                start ++;
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int minSize = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right ++) {
            sum += nums[right];
            while (sum >= target) {
                minSize = Math.min(minSize, right - left + 1);
                sum -= nums[left];
                left ++;
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
