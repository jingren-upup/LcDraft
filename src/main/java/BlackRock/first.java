package BlackRock;
import java.io.*;
import java.math.*;
import java.util.*;

public class first {

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
