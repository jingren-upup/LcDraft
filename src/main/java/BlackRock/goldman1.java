package BlackRock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result{
    public static List<String> groupTransactions(List<String> transactions) {
        // Write your code here
        Map<String,Integer> map = new HashMap<>();
        List<String>list = new ArrayList<>();
        for(String s:transactions){
            map.put(s,map.getOrDefault(map.get(s),0)+1);
        }
        for(String s:map.keySet()){
            list.add(s + " " + String.valueOf(map.get(s)));
        }
        return list;
    }
}

public class goldman1 {

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
