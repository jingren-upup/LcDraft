package BlackRock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result2{
    public static long maxProfit(int k, List<Integer> profit) {
        int ans=Integer.MIN_VALUE,i=0,j=0,sum=0;
        while(j<profit.size()){
            sum+= profit.get(j) + profit.get((j + profit.size() / 2) % profit.size());
            if(j-i+1==k){
                ans=Math.max(ans,sum);
                sum-= profit.get(i) + profit.get((i + profit.size() / 2) % profit.size());
                ++i;
            }
            ++j;
        }
        return ans;

    }
}


public class goldman2 {

        public static void main(String args[])throws Exception
        {
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            ArrayList<Integer> a = new ArrayList<Integer>(); //for A
            ArrayList<Integer> b = new ArrayList<Integer>(); //for B
            ArrayList<Integer> c = new ArrayList<Integer>(); //for C
            String[] input;

            input = br.readLine().split(" ");
            for (int i = 0; i < input.length; i++)
            {
                try
                {
                    Integer.parseInt(input[i]); //Checking valid input
                }
                catch (NumberFormatException e)
                {
                    System.out.println("-1");
                    return ;
                }
                a.add(Integer.parseInt(input[i]));
            }

            input = br.readLine().split(" ");
            for (int i = 0; i < input.length; i++)
            {
                try
                {
                    Integer.parseInt(input[i]); //Checking valid input
                }
                catch (NumberFormatException e)
                {
                    System.out.println("-1");
                    return ;
                }
                b.add(Integer.parseInt(input[i]));
            }

            input = br.readLine().split(" ");
            for (int i = 0; i < input.length; i++)
            {
                try
                {
                    Integer.parseInt(input[i]); //Checking valid input
                }
                catch (NumberFormatException e)
                {
                    System.out.println("-1");
                    return ;
                }
                c.add(Integer.parseInt(input[i]));
            }

            int x=(c.get(0))*b.size()+c.get(1);
            System.out.println(x);

        }

}
