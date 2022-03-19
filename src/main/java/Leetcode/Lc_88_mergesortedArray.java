package Leetcode;


import java.util.Arrays;
import java.util.LinkedList;

public class Lc_88_mergesortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);

    }
}
