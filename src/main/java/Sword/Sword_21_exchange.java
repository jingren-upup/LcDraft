package Sword;

public class Sword_21_exchange {
    public int[] exchange(int[] nums) {
      int len = nums.length;
      int[] res = new int[len];
      int i = 0, j = len -1;
      for (int tmp:nums){
              //奇数
              if (tmp % 2 ==1){
                  res[i] = tmp;
                  ++i;
              }
              //偶数
              else {
                  res[j] = tmp;
                  --j;
              }
          }
      return res;
    }
}
