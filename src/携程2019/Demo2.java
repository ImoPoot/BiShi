package 携程2019;

import java.util.*;

class LRU{
    public Map<Integer,Integer> map;
    public List<Integer>  list;
    public int cap;
    public LRU(int cap)
    {
        this.cap=cap;
        map=new HashMap<>();
        list=new LinkedList<>();
    }
    public void put(int key,int value)
    {
        if(cap==0)
            return;
        if(map.containsKey(key))
        {
            map.put(key,value);
        }
        else {
            if(list.size()==cap)
            {
                int x= list.remove(0);
                list.add(key);
                map.remove(x);
                map.put(key,value);
            }
            else {
                list.add(key);
                map.put(key,value);
            }
        }
    }

    public int get(int key)
    {
        if(cap==0)
            return -1;
        if(map.containsKey(key))
        {
            list.remove((Integer)key);
            list.add(key);
            return map.get(key);
        }
        else {
            return -1;
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cap=sc.nextInt();
        sc.nextLine();
        LRU lru=new LRU(cap);
        while(sc.hasNext())
        {
            String[] line=sc.nextLine().split(" ");
            if(line[0].equals("p"))
            {
                lru.put(Integer.parseInt(line[1]),Integer.parseInt(line[2]));
            }
            else {
                System.out.println(lru.get(Integer.parseInt(line[1])));
            }
        }
    }
}
