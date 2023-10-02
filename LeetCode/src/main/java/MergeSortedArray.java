import java.lang.reflect.Array;
import java.util.Arrays;

class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = 0;
        for (int i = n; i < m+n; i++) {
            nums1[i] = nums2[start];
            start += 1;
        }
        Arrays.sort(nums1);
    }
}