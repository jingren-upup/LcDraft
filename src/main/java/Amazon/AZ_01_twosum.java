package Amazon;

public class AZ_01_twosum {
    public int[] twoSum(int[] nums, int target) {
        int head = 0, tail = nums.length;
        int[] res = new int[2];
        for (int i = head;i<tail;++i){
            for (int j = tail;j>head;--j){
                if (target==nums[i]+nums[j]){
                    res[0] = nums[i];
                    res[1] = nums[j];
                    return new int[]{i,j};
                }

            }

        }
      return res;
    }

}
