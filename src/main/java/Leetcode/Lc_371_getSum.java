package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc_371_getSum {
    public int getSum(int a, int b) {
        int carry;
        while(b!=0){
            carry = (a&b)<<1;
            a = (a^b);
            b = carry;
        }
        return a;
    }
}
