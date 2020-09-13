package 其他;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        String s="qwidpaaad";
        System.out.println(sort(s));
    }

    public static String sort(String string)
    {
        int n=string.length();
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char c= string.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        Comparator<Map.Entry<Character,Integer>> comparator=new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        };
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,comparator);
        for(int i=0;i<list.size();i++)
        {
            Map.Entry<Character,Integer> entry=list.get(i);
            for(int j=0;j<entry.getValue();j++)
            {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
