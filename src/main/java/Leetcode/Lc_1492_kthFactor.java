package Leetcode;

public class Lc_1492_kthFactor {
    public int kthFactor(int n, int k) {
        for(int d=1;d<=n/2;++d){
            if(n%d == 0 && k-- == 0){
                return d;
            }
        }
        return k==1?n:-1;

    }
}
