package Sort;

public class mergeSort {
    public int findKthLargest(int[] nums, int k) {
        mergesort(nums,0,nums.length-1);
        return nums[k-1];
    }
    private void mergesort(int[] nums, int start, int end){
        if (start>=end){
            return;
        }
        int mid = (start+end)/2;
        if (start < end){
            mergesort(nums,start,mid);
            mergesort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    private void merge(int[] nums, int start, int mid ,int end){
        //总长度
        int[] tmp = new int[end-start+1];
        //左右指针
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid&&j<=end){
            //比较
            if (nums[i]>nums[j]){
                tmp[k++] = nums[i++];
            }else{
                tmp[k++] = nums[j++];
            }

        }

        while(i<=mid){
            tmp[k++] = nums[i++];
        }
        while(j<=end){
            tmp[k++] = nums[j++];
        }
        for(int k2 = 0; k2 < tmp.length;++k2){
            nums[k2+start] = tmp[k2];
        }
    }
}
