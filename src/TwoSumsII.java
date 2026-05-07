import java.util.Arrays;

public class TwoSumsII {
    public static void main(String[] args) {
        int [] nums = {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int []{left + 1, right + 1};
            }
            if (numbers[left] + numbers[right] > target) {
                right --;
            } else {
                left ++;
            }
        }
        return new int [] {-1, -1};
    }
}
