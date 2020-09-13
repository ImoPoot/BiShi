package 字节跳动2019春招研发;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] state=new int[10];
        for(int i=0;i<13;i++)
        {
            int x=sc.nextInt();
            state[x]++;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            if(state[i]>=4)
                continue;
            state[i]++;
            if(help(Arrays.copyOf(state,10),14,false)) list.add(i);
            state[i]--;
        }
        if(list.isEmpty())
            System.out.println(0);
        else {
            for(Integer i:list)
                System.out.printf("%d ",i);
        }
    }

    public static boolean help(int[] state,int total,boolean hasHead)
    {
        if(total==0)
            return true;
        if(!hasHead){
            for(int i=1;i<=9;i++)
            {
                if(state[i]>=2)
                {
                    state[i]-=2;
                    if(help(state,total-2,true))
                        return true;
                    state[i]+=2;
                }
            }
            return false;
        }
        else {
            for(int i=1;i<=9;i++)
            {
                if(state[i]>=3)
                {
                    state[i]-=3;
                    if(help(state,total-3,true))
                        return true;
                    state[i]+=3;
                }
                else if(i>=3&&state[i]>0&&state[i-1]>0&&state[i-2]>0)
                {
                    state[i]--;
                    state[i-1]--;
                    state[i-2]--;
                    if(help(state,total-3,true))    return true;
                    state[i]++;
                    state[i-1]++;
                    state[i-2]++;
                }
            }
            return  false;
        }
    }
}
