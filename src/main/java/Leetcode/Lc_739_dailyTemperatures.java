package Leetcode;

import java.util.Stack;

public class Lc_739_dailyTemperatures {
    public static void main(String[] args) {
      Lc_739_dailyTemperatures temperatures = new Lc_739_dailyTemperatures();
      int[] temp = {73,74,75,71,69,72,76,73};
      temperatures.dailyTemperatures(temp);

    }
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack = new Stack<>();
       int[] res = new int[temperatures.length];
       for (int i = 0; i<temperatures.length; i++){
           while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
               int pre = stack.pop();
               res[pre] = i-pre;
           }
           stack.add(i);
       }
        return res;
    }
}
