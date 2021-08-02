package Huawei728;



// 5
// 2
// 4
// 2 1
// 3 1
// 4 2
// 1 5



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        输入
//        第一行为要吃几幅药
//        第二行一天最多吃几幅
//        第三行输入接下来几组依赖关系
//        2 1表示吃了2才能吃1
//        3 1吃了3才能吃1
//        有依赖关系的不能一天吃
//        输出
//        最快4天吃完
class medicineNode{
    int inNum = 0;
    int outNum = 0;
    ArrayList<Integer> per = new ArrayList<>();

    public int getInNum() {
        return inNum;
    }

    public void setInNum(int inNum) {
        this.inNum = inNum;
    }

    public int getOutNum() {
        return outNum;
    }

    public void setOutNum(int outNum) {
        this.outNum = outNum;
    }

    public ArrayList<Integer> getPer() {
        return per;
    }

    public void setPer(ArrayList<Integer> per) {
        this.per = per;
    }
}
public class Huawei2 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int maxOneDay = sc.nextInt();
        sc.nextLine();
        int m = sc.nextInt();
        int temp = m;
        sc.nextLine();
        ArrayList<medicineNode> list = new ArrayList<>();
        while(temp > 0){
            int num1 , num2;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            list.get(num1 - 1).per.add(num2-1);
            list.get(num1 - 1).outNum++;
            list.get(num2 - 1).inNum++;
            sc.nextLine();
            temp--;
        }
        int sumDay = 0;
        int havedNum = 0;





    }
}
