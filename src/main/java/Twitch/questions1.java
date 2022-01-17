package Twitch;

import java.util.*;

public class questions1 {
    String[] info = new String[]{"Ninja", "100000", "Fortnite", "Pokimane", "40000", "Valorant"};
    Map<String,Integer>map = new HashMap<>();
    public static void main(String[] args) {
//            questions1 q1 = new questions1();
//            q1.solution();
    }
    public String[] solution(String[] streamerInformation, String[] commands){

        LinkedList<String> resultlist = new LinkedList<String>();

        for(int i = 0; i < commands.length; i++) {
            String s = commands[i];
            String temp = "";
            String[] temp1;
            if(s.equals("StreamerOnline")) {
                temp1 = StreamerOnline(streamerInformation, commands[i+1], commands[i+2], commands[i+3]);
            } else if(s.equals("UpdateViews")) {

            } else if(s.equals("UpdateCategory")) {

            } else if(s.equals("StreamerOffline")) {

            } else if(s.equals("ViewsInCategory")) {
                temp = String.valueOf(viewsIncategory(streamerInformation, commands[i+1]));
            } else if(s.equals("TopStreamerInCategory")) {
                temp = topStreamerInCategory(streamerInformation, commands[i+1]);
            } else if(s.equals("TopStreamer")) {
                temp = TopStreamer(streamerInformation);
            }
            resultlist.add(temp);
        }


        return resultlist.toArray(new String[0]);



    }
    public  String[] StreamerOnline(String[] streamerInformation,String name,String views,String game){
        int len = streamerInformation.length + 3;
        String[] res = new String[len];

            if (!map.containsKey(name)){


                int i;
                for ( i = 0; i < len;++i){
                    res[i] = streamerInformation[i];
                }
                res[i+1] = name;
                res[i+2] = views;
                res[i+3] = game;
            }


                return res;

    }
    public int viewsIncategory(String[] streamerInformation, String command) {
        int result = 0;
        for(int i = 2; i < streamerInformation.length; i = i+3) {
            if(streamerInformation[i].equals(command)) {
                result += Integer.parseInt(streamerInformation[i-1]);
            }
        }
        return result;

    }
    public String topStreamerInCategory(String[] streamerInformation, String command) {
        String result = null;
        int max = 0;
        for(int i = 2; i < streamerInformation.length; i = i+3) {
            if(streamerInformation[i].equals(command)) {
                if(Integer.parseInt(streamerInformation[i-1]) > max) {
                    max = Integer.parseInt(streamerInformation[i-1]);
                    result = streamerInformation[i-2];
                }
            }
        }
        return result;
    }
    public String TopStreamer(String[] streamerInformation) {
        String result = null;
        ArrayList<Integer> array = new ArrayList<>();
        int[] array1 = {5,4,52,2};
//        array.
        int max = 0;
        for(int i = 1; i < streamerInformation.length; i = i+3) {
            if(Integer.parseInt(streamerInformation[i]) > max) {
                max = Integer.parseInt(streamerInformation[i]);
                result = streamerInformation[i-1];
            }
        }
        return result;

    }





}
