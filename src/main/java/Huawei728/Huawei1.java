package Huawei728;

//
//        第一题 服务器
//        输入
//// 4
//// 0,2,200,0,1
//// 1,3,400,0,1
//// 2,3,400,1,0
//// 3,3,300,0,1
//// 3 1 3 200 0 1
//        输出
////2 1 3
//        第一行输入服务器个数M
//        接下来M行为服务器参数，按顺序为编号，cpu数，内存大小， 架构， 是否支持NP卡
//        最后一行为选择要求， 按顺序为服务器数， 选择策略， cpu数，内存大小，架构， NP
//        (服务器cpu数内存应不小于要求， 架构NP必须一致)
//        其中架构0-8 为9则都可以
//        NP 0-1 为2则都可以
//        选择策略：
//        为1时 cpu优先， 优先最符合的cpu数，在选最符合的内存大小
//        为2时 内存优先， 优先最符合的内存大小，在选最符合的cpu数
//        cpu数内存大小一样时，按编号大小选
//        输出说明， 选两台， 分别为1,3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Server{
    int mNum;
    int mCores;
    int mMemSize;
    int mCpuArch;

    public Server(int mNum, int mCores, int mMemSize, int mCpuArch, int mSupportNP) {
        this.mNum = mNum;
        this.mCores = mCores;
        this.mMemSize = mMemSize;
        this.mCpuArch = mCpuArch;
        this.mSupportNP = mSupportNP;
    }

    int mSupportNP;

    public int getmNum() {
        return mNum;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }

    public int getmCores() {
        return mCores;
    }

    public void setmCores(int mCores) {
        this.mCores = mCores;
    }

    public int getmMemSize() {
        return mMemSize;
    }

    public void setmMemSize(int mMemSize) {
        this.mMemSize = mMemSize;
    }

    public int getmCpuArch() {
        return mCpuArch;
    }

    public void setmCpuArch(int mCpuArch) {
        this.mCpuArch = mCpuArch;
    }

    public int getmSupportNP() {
        return mSupportNP;
    }

    public void setmSupportNP(int mSupportNP) {
        this.mSupportNP = mSupportNP;
    }
}
public class Huawei1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Server[] servers = new Server[m];
        int temp = m;
//        while (m--){
//
//        }

    }

}
