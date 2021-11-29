package Amazon;

public class AZ_15_missingNumber {

    public int missingNumber(int[] nums) {
        int[] res = new int[nums.length+1];
        for (int i = 0;i<nums.length+1;++i){
            res[i] = 0;
        }
        for (int i = 0;i<nums.length;++i){
            res[nums[i]]++;
        }
        for (int i = 0;i<nums.length+1;++i){
            if (res[i] == 0){
                return i;
            }
        }
        return 0;
    }
}
