package huawei1020;

import com.kenai.jaffl.annotations.In;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[] fre = new int[n];
        int sum = 0;
        for (int i = 0; i<n; ++i){
            fre[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i){
            for (int j =0;j<n-1-i;++j){
                if (fre[j]<fre[j+1]){
                    int temp = fre[j];
                    fre[j] = fre[j+1];
                    fre[j+1] = temp;
                }
            }
        }
        for (int j:fre){

        }


        for (int i = 0; i<n;++i){
            if (map.containsKey(fre[i])){
                i = i-1;
                n = n - 1;
                break;
            }
            map.put(fre[i],i+1);
        }
        int M = sc.nextInt();
        for (int i = 0; i < M;++i ){
            int num = sc.nextInt();
            if (num > n){
                System.out.println(-1);
                return;
            }
            sum += map.get(fre[num]);
        }
        System.out.println(sum);
    }
}
