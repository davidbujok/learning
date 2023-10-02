public class Main {
    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = new int[6]; // Modify the size accordingly
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;

        int[] nums2 = {2, 5, 6};

        int m = 3; // Number of elements in nums1
        int n = 3; // Number of elements in nums2

        merger.merge(nums1, m, nums2, n);
        System.out.println(nums2[0]);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}