package Leetcode;

import java.util.ArrayList;


public class Lc_338_countBits {
    public int[] countBits(int n) {

        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }
}
