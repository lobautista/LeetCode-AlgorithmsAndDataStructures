public class ContainerWithMostWater {

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int width = right - left;
            if (height [left] < height[right]) {
                max = Math.max((height[left] * width), max);
                left ++;
            } else {
                max = Math.max((height[right] * width), max);
                right --;
            }
        }
        return max;
    }
}
