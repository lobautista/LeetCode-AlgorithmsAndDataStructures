import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int p = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                i --;
                p --;
            } else {
                nums1[p] = nums2[j];
                j --;
                p --;
            }
        }

        while (j >= 0) {
            nums1[p] = nums2[j];
            j --;
            p --;
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1};
        int [] nums2 = {0};
        merge(nums1, 1, nums2, 0);
    }
}
