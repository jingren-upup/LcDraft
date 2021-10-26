//import java.util.*;
//
//public class Main {
//    static LinkedList<Integer> res = new LinkedList<>();
//    static int[] candy;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        candy = new int[n];
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            candy[i] = sc.nextInt();
//            sum += candy[i];
//        }
//        if (sum % 2 != 0) {
//            System.out.println(-1);
//            return;
//        }
//        int half = sum / 2;
//        boolean flag = bfs(0, half, n);
//        if (!flag) {
//            System.out.println(-1);
//            return;
//        }
//        System.out.println(half);
//        Set<Integer> set = new HashSet<>();
//        for (Integer re : res) {
//            System.out.print(candy[re] + " ");
//            set.add(re);
//        }
//        System.out.println("");
//        for (int i = 0; i < n; i++) {
//            if (set.contains(i)) {
//                continue;
//            }
//            System.out.print(candy[i] + " ");
//        }
//
//    }
//
//    static boolean bfs(int i, int sum, int n) {
//        if (sum < 0 || i >= n) {
//            return false;
//        }
//        if (sum == 0) {
//            return true;
//        }
//        for (int j = i; j < n; j++) {
//            res.add(i);
//            boolean flag = bfs(j+1, sum-candy[i], n);
//            if(flag) {
//                return true;
//            }
//            res.removeLast();
//        }
//        return false;
//    }
//
//}