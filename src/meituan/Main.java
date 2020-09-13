package meituan;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        for(int i=0;i<p;i++)
        {
            setA.add(sc.nextInt());
        }
        for(int i=0;i<q;i++)
        {
            setB.add(sc.nextInt());
        }
        int countA=0;
        for(Integer i:setB)
        {
            if(setA.contains(i))
                countA++;

        }


        System.out.printf("%d %d %d",setA.size()-countA,setB.size()-countA,countA);
    }
}