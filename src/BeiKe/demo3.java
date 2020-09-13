package BeiKe;

import java.util.*;

public class demo3 {
    public static Map<String,Long> memo=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[3];
        while(n-->0)
        {
            for(int i=0;i<3;i++)
            {
                arr[i]=sc.nextInt();
            }
            Set<Integer>[] xx=new Set[arr[1]+1];
            for(int i=0;i<arr[1];i++ )
            {
                xx[i+1]=new HashSet<>();
                for(int j=0;j<arr[2];j++)
                {
                    xx[i+1].add(sc.nextInt());
                }
            }
            long result=help(xx,0,arr[0]);
            result%=(long)Math.pow(10,9)+7;
            System.out.println(result);
        }
    }

    public static long help(Set<Integer>[] xx,int n,int total)
    {
        int choices=xx.length;
        long res=0;
        for(int i=1;i<choices;i++)
        {
            res+=dfs(xx,n+1,i,total);
        }
        return  res;
    }
    public static long dfs(Set<Integer>[] xx,int n,int color,int total)
    {
        String key=n+"-"+color;
        if(n==total)
        {
            return 1;
        }

        if(memo.containsKey(key))
            return memo.get(key);
        long res=0;
        for(int i=1;i<xx.length;i++)
        {
            if(xx[color].contains(i))
                continue;
            else {
                res+=dfs(xx,n+1,i,total);
            }
        }
        memo.put(key,res);
        return res;
    }
}
