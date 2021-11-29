package Amazon;

public class AZ_10_rotate {
    public void rotate(int[][] matrix) {
        //易得 新的数组的i 等于上个数组的j
        //新的数组的j等于上个数组的长度减去i再减1
        int len = matrix.length;
        int[][] newMatrix = new int[len][len];
        for (int i =0;i<len;++i){
            for (int j = 0;j<len;++j){
                newMatrix[j][len-i-1] = matrix[i][j];
            }
        }
        for (int i =0;i<len;++i){
            for (int j = 0;j<len;++j){
                matrix[i][j] = newMatrix[i][j];
            }
        }

    }
}
