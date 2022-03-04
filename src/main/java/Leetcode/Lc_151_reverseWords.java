package Leetcode;

public class Lc_151_reverseWords {
    public String reverseWords(String s) {
       char[] charAry = s.toCharArray();
       int left = 0;
       int right = charAry.length - 1;
       StringBuilder sb = new StringBuilder();
       //剪枝
       while(charAry[left] == ' ') left++;
       while(charAry[right] == ' ') right--;
       //开始循环
       while(left<=right){
           //从最右边开始
           int index = right;
           //遍历这一单词
           while(index >= left && charAry[index] != ' ') index--;
           //单词插入
           for(int i = index+1; i <= right;++i) sb.append(charAry[i]);
           //插入空格
           if(index > left) sb.append(' ');
           //跳过空格
           while(index >= left && charAry[index] == ' ') index--;
           //指针指向下一轮
           right = index;
       }
       return sb.toString();
    }
}
