package Amazon;

public class AZ_40_search {

    public int search(int[] nums, int target) {
        //如果中间的数小于最右边的数 则右半段是有序的 若中间数是大于最右边的 则做半段有序来判断区间
        int i = 0, j = nums.length -1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //小于最右
            else if (nums[mid] < nums[j]) {
                //在右半区
                if (nums[mid] < target && target <= nums[j]) {
                    i = mid + 1;
                }
                //不一定在右半区
                else {
                    j = mid - 1;
                }
            } else {
                //在左半区
                if(nums[mid]>target&&target>=nums[i]) {
                    j = mid - 1;
                }
                //不在左半区
                else {
                    i = mid + 1;
                }
            }
        }

        return -1;
    }
}