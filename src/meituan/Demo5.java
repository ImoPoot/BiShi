package meituan;

import java.util.*;

public class Demo5 {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++)
            {
                array[i]=sc.nextInt();
            }
            Set<Integer> set=new HashSet<>();
            for(int i=n-1;i>=0;i--)
            {
                if(!set.contains(array[i]))
                {
                    set.add(array[i]);
                    System.out.printf("%d ",array[i]);
                }
            }
            /*
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                if(list.contains(x))
                {
                    list.remove(x);
                    list.add(0,x);
                }
                else{
                    list.add(0,x);
                }
            }
            for(Integer i:list)
            {
                System.out.printf("%d ",i);
            }
             */
        }
    }

