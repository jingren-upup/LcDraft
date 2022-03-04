package BlackRock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class third {


        private static void checkCycle_getMaxRating(ArrayList<String> inputLines)
        {
            HashMap<String, Integer> idToIndex = new HashMap<>();
            int nodeNum = 0;
            for(String line : inputLines)
            {
                line = line.trim();
                String[] nodes = line.split("|");
                String src = nodes[0].trim();
                String dest = nodes[1].trim();
                if(!idToIndex.containsKey(src))
                {
                    idToIndex.put(src, nodeNum);
                    nodeNum++;
                }
                if(!idToIndex.containsKey(dest))
                {
                    idToIndex.put(dest, nodeNum);
                    nodeNum++;
                }
            }
            int n = idToIndex.size();
            int[][] edges = new int[n][2];
            String[] rates = new String[n];
            int k = 0;
            for(String line : inputLines)
            {
                //System.out.println(convert);
                line = line.trim();
                if(line.contains(" ")) continue; //??
                String[] nodes = line.split("|");
                String src = nodes[0].trim();
                String dest = nodes[1].trim();
                int start = idToIndex.get(src);
                int end = idToIndex.get(dest);
                edges[k] = new int[]{start, end};
                rates[k] = nodes[2].trim();
                k++;
            }
            boolean isCyclic = checkCyclic(n, edges);
            if(isCyclic)
            {
                System.out.println("cyclic");
            }
            else
            {
                System.out.println("noncyclic");
            }
        }
        private static boolean checkCyclic(int n, int[][] edges)
        {
            if(edges.length != n-1) return false;
            List<List<Integer>> graph = new ArrayList<>();
            for(int i=0; i<n; i++)
            {
                graph.add(new ArrayList<>());
            }
            for(int[] e : edges)
            {
                graph.get(e[0]).add(e[1]);
            }
            Queue<Integer> q = new LinkedList<>();
            Set<Integer> seen = new HashSet<>();
            q.add(0);
            seen.add(0);
            while(!q.isEmpty())
            {
                int node = q.poll();
                for(int nei : graph.get(node))
                {
                    if(seen.contains(nei))
                    {
                        continue;
                    }
                    seen.add(nei);
                    q.add(nei);
                }
            }
            return seen.size()<=n;
        }
        public static void main(String[] args) throws IOException
        {
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line;
            ArrayList<String> inputLines = new ArrayList<>();
            while ((line = in.readLine()) != null)
            {
                //System.out.println(line);
                inputLines.add(line);
            }
            third.checkCycle_getMaxRating(inputLines);
        }

}
