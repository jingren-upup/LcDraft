package Leetcode;

public class Lc_69_mySqrt {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int left = 1,right = x;
        while(true){
            int mid = (left+right)/2;
            if(mid>x/mid){
                right = mid-1;
            }else {
                if(mid+1>x/(mid+1)) return mid;
                left = mid+1;
            }

        }

    }
}
