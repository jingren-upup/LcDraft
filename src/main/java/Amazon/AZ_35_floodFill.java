package Amazon;

public class AZ_35_floodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return dfs(image,sr,sc,newColor,image[sr][sc]);
    }
    private int[][] dfs(int[][] image, int i, int j,int newcolor,int num){
        int m = image.length;
        int n = image[0].length;
        if (i<0||i>=m||j<0||j>=n||image[i][j]!=num||image[i][j] == newcolor){

        }else{
            int tmp = image[i][j];
            image[i][j] = newcolor;
            dfs(image,i+1,j,newcolor,tmp);
            dfs(image,i-1,j,newcolor,tmp);
            dfs(image,i,j+1,newcolor,tmp);
            dfs(image,i,j-1,newcolor,tmp);
        }
        return image;
    }
}