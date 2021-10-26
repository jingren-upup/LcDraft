package DataBrick;

public class first {
    static int countArithmeticMeans(int[] a) {

        int res = 0;
        for(int i = 0;i< a.length;++i){
            if(i == 0){
                if(a[i] == a[i+1]/2){
                    res++;
                }
            }else if(i == a.length-1){
                if(a[i] == a[i-1]/2){
                    res++;
                }

            }else{
                if(a[i] == (a[i-1] + a[i+1])/2){
                    res++;
                }
            }

        }
        System.out.println(res);
        return res;

    }
    public static void main(String[] args) {
       int[] a = new int[]{39, 36, 33, 30, 27, 4, 5, 6, 24, 25, 26, 30, 27, 24, 21, 88, 32, 20, 79, 15, 2, 34, 90, 29, 28, 73, 30, 7, 1, 82, 79, 38, 35, 17, 88, 82, 42, 76, 92, 57, 19, 81, 35, 71, 55, 20, 21, 51, 90, 15, 88, 16, 99, 74, 54, 44, 28, 14, 77, 6, 66, 24, 55, 22, 22, 10, 14, 100, 37, 0, 83, 40, 86, 93, 51, 58, 67, 96, 97, 92, 6, 85, 21, 15, 58, 71, 42, 1, 9, 73, 95, 13, 11, 42, 32, 82, 10, 84, 99, 38};
        countArithmeticMeans(a);
    }

}
