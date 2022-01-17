package Amazon;

public class AZ_39_findMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (findKth(nums1,0,nums2,0,left)+findKth(nums1,0,nums2,0,right))/2.0;
    }
    private int findKth(int[] nums1,int i,int[] nums2, int j, int k){
        //如果为空数组
        if (i>=nums1.length) return nums2[j+k-1];
        if (j>=nums2.length) return nums1[i+k-1];
        // 边界情况
        if (k==1) return Math.min(nums1[i],nums2[j]);
        // 在 nums1 和 nums2 当前范围内找出 mid1 和 mid2 判断舍弃哪半部分
        int midval1 = (i+k/2 -1 < nums1.length) ? nums1[i+k/2-1]:Integer.MAX_VALUE;
        int midval2 = (j+k/2 -1 < nums2.length) ? nums2[j+k/2-1]:Integer.MAX_VALUE;
        // mid1 < mid2 在 nums1.right 和 nums2 之间搜索, 丢掉 k/2 个数.
        if (midval1>=midval2){
            return findKth(nums1,i,nums2,j+k/2,k-k/2);
        }else{
            return findKth(nums1,i+k/2,nums2,j,k-k/2);
        }

    }
}