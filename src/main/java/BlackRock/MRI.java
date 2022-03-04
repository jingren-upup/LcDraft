package BlackRock;

import java.util.*;

public class MRI {
    public static List<Integer> itemsSort(List<Integer> items) {
        // Write your code here
        HashMap<Integer,Integer> hm = new HashMap<>();

        int c = 0;
        for(int i=0;i<items.size();i++){
            if(hm.containsKey(items.get(i))){
                int v = hm.get(items.get(i));
                v++;
                hm.put(items.get(i),v);
            }else{
                hm.put(items.get(i),1);
                c++;
            }
        }

        int[][] arr = new int[c][2];

        int i=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            arr[i][0] = entry.getKey();
            arr[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(arr,(a, b)->a[0] - b[0]);

        //frequency in increasing order
        Arrays.sort(arr,(a,b)->a[1]-b[1]);

        List<Integer> ans = new ArrayList<>(items.size());
        int j=0;
        for(i=0;i<arr.length;i++){
            int count = 0;
            while(count<arr[i][1]){
                ans.set(j, arr[i][0]);
                j++;
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 841;
        int x = 1;
        for(int i = 0; i < 50 ;i++){
            int nx = (x+n/x)/2;
            x = nx;
        }
        System.out.println(x);
    }
}



