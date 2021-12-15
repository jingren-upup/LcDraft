package Sword;

/**
 * 关键是推导动态规划方程：
 * dp[i] = dp[i-1] + dp[i-2] 是关键
 *
**/
public class Sword_46_translatedNum {
    public int translateNum(int num) {
        //cur 对应dp[i-1] pre 对应dp【i-2] x y 是个位十位
        int cur = 1,pre = 1, x,y = num%10;
        while(num>0){
            num/=10;
            x = num%10;
            int tmp = 10*x+y;
            //如果 小于25 那么则符合转移方程 否则单个相加
            int c = (tmp>=10 && tmp<=25) ? cur+pre:cur;
            //移动位置
            pre = cur;
            cur = c;
            y = x;
        }
     return cur;
    }
}
