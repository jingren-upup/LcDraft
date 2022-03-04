package Twitch;

import java.util.*;

//数组中两个元素和小于等于M的组合数
//对于一个数组，里面任何2个元素相加，小于等于M的组合有多少种；
//如果有符合的，输出组合对数；
//没有，输出0；
//比如：
//7 -1 -1
//9
//表示数组为[7, -1, -1]，M=9
//里面任何两个元素小于等于9的组合有3种，分别是(7,第2个元素 -1), (第2个元素 -1, 第3个元素 -1), (7, 第3个元素 -1)，不同位置相同的元素值，但可以组成不同的组合，故输出为 3
//
//测试用例：
//-5, -4, -1, -1, 2, 3, 4, 6, 7, 9
//9
public class test11 {
//    public static int main(String[] args) {
//        int[] testcase = {7, -1, -1,2};
//        int target = 9;
//        int res = 0;
//        Arrays.sort(testcase);
//        //{-1,-1,2,7,9,11,14}
//        for(int i = 0;i<testcase.length;++i){
//            for(int j = testcase.length -1;j>i;--j){
//                if(testcase[i]+testcase[j]>target && i == 0){
//                    continue;
//                }else{
//                    res++;
//                    continue;
//                }
//
//            }
//
//        }
//
//    }
public static void main(List<Integer> stocks, long target) {
    Collections.sort(stocks);
//    Map<Integer,Integer>map = new HashMap<>();
//    int count = 0;
//    for(int i:stocks){
//        map.put(i,map.getOrDefault(i,0)+1);
//    }
//    for (int i = 0;i<stocks.size();++i){
//        int j = (int) (target- stocks.get(i));
//        if(map.containsKey(j) && map.get(j)!=0){
//            map.put(j,map.get(j)-1);
//            count++;
//        }
//    }
//    return count;
}

}
