package Huawei728;



import java.util.*;

public class Huawei3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] nums = new int[m][n];
        for (int i = 0; i< m ; i++){
            sc.nextLine();
            for (int j = 0;j <n; j++){
                nums[i][j] = sc.nextInt();

            }
        }


        int available = 0;
        int[] start = new int[2];
        for (int i = 0; i <nums.length;i++){
            for (int j = 0; j< nums[0].length;j++){
                if (nums[i][j] ==1){
                    start[0] = i;
                    start[1] = j;
                }
                if (nums[i][j] == 0){
                    available++;
                }

            }

        }
        int[][] trace = new int[m][n];
        int res = dfs(nums,start[0],start[1],trace,available+1);
        System.out.println(res);

    }
    public  static int dfs(int[][] nums, int i,int j, int[][] trace, int restPoint){
        if (i < 0 || i >= nums.length || j<0 ||j>=nums[0].length){
            return 0;
        }
        if (nums[i][j] == 2 && restPoint ==0){
            return 1;
        }
        if (nums[i][j] == 2 || nums[i][j] == -1 || trace[i][j] ==1){
            return 0;
        }
        trace[i][j] = 1;
        int res = dfs(nums, i+1, j, trace, restPoint-1)
                + dfs(nums, i-1, j, trace, restPoint-1)
                + dfs(nums, i, j+1, trace, restPoint-1)
                +dfs(nums, i, j-1, trace, restPoint-1);
        trace[i][j] = 0;
        return res;
    }
}