import com.kenai.jaffl.annotations.In;

import java.util.*;
public class Huawei3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] num = new int[m][n];
        for (int i = 0; i< m ; i++){
            sc.nextLine();
            for (int j = 0;j <n; j++){
                num[i][j] = sc.nextInt();
//                System.out.println(num[i][j]);
            }
        }


        for (int i = 0; i< num.length ; i++){

            for (int j = 0;j <num[i].length; j++){

               System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }





//        System.out.println(s);

//        int [] arr = new int[m];



//        for (int i =0; i< m;i++){
//

//            arr[i] = Integer.parseInt(s.substring(i,i+1));
//            System.out.println(arr[i]);
//        }
//        System.out.println(m);
//        int[] n = new int[m];


//        String s = sc.nextLine();
//        int num = Integer.parseInt(String.valueOf(s.split(" ")));
//        System.out.println(num);
//        for (int i = 0; i<m;i++){
//
//
//        }


//        System.out.println(n);

//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] nums = new int[m][n];
//
//        for(int i = 0;i<m;i++){
//           for(int j = 0;i < n;j++){
//                if (sc.hasNext()){
//                    String s = sc.nextLine();
//                    nums[i][j] = sc.nextInt();
//                    nums[i][j] = Integer.valueOf(s);
//                }



            }
        }

//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] nums = new int[m][n];
//
//        for(int i = 0;i<m;i++){
//            for(int j = 0;i < n;j++){
//                nums[i][j] = sc.nextInt();
//            }
//        }
//
//        int available = 0;
//        int[] start = new int[2];
//        for (int i = 0; i <nums.length;i++){
//            for (int j = 0; j< nums[0].length;j++){
//                if (nums[i][j] ==1){
//                    start[0] = i;
//                    start[1] = j;
//                }
//                if (nums[i][j] == 0){
//                    available++;
//                }
//
//            }
//
//        }
//        int[][] trace = new int[m][n];
//        int res = dfs(nums,start[0],start[1],trace,available+1);
//        System.out.println(res);
//
//    }
//    public  static int dfs(int[][] nums, int i,int j, int[][] trace, int restPoint){
//        if (i < 0 || i >= nums.length || j<0 ||j>=nums[0].length){
//            return 0;
//        }
//        if (nums[i][j] == 2 && restPoint ==0){
//            return 1;
//        }
//        if (nums[i][j] == 2 || nums[i][j] == -1 || trace[i][j] ==1){
//            return 0;
//        }
//        trace[i][j] = 1;
//        int res = dfs(nums, i+1, j, trace, restPoint-1)
//                + dfs(nums, i-1, j, trace, restPoint-1)
//                + dfs(nums, i, j+1, trace, restPoint-1)
//                +dfs(nums, i, j-1, trace, restPoint-1);
//        trace[i][j] = 0;
//        return res;
//    }
//}