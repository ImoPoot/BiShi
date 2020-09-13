package 字节跳动2019春招研发;

import java.util.Scanner;

public class Demo6 {
    public static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] cost=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                cost[i][j]=sc.nextInt();
            }
        boolean[] mark=new boolean[n];
            mark[0]=true;
        all(cost,1,mark,0,0);
        System.out.println(min);
    }

    public static boolean all(int[][] cost,int count,boolean[] mark,int start,int spend)
    {
        if(count==cost.length)
        {
            min=Math.min(min,spend+cost[start][0]);
            return true;
        }
        for(int i=1;i<cost.length;i++)
        {
            if(mark[i])
                continue;
            else {
                mark[i]=true;
                spend+=cost[start][i];
                if(all(cost,count+1,mark,i,spend)) ;
                mark[i]=false;
                spend-=cost[start][i];
            }
        }
        return true;
    }
}
