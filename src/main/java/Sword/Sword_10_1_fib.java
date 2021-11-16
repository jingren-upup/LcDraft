package Sword;

import java.util.HashSet;
import java.util.Set;

public class Sword_10_1_fib {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; ++i) {
            sum = (a+b)% 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
