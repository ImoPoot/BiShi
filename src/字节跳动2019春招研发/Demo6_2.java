package 字节跳动2019春招研发;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo6_2 {
    public static final int IMPOSSIBLE=1000000;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] cost=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                cost[i][j]=sc.nextInt();
            }
        int col=1<<(n-1);
        int[][] dp=new int[n][col];
        for (int i=0;i<n;i++)
        {
            dp[i][0]=cost[0][i];
        }
        for(int j=1;j<col;j++)
            for(int i=0;i<n;i++)
            {
                if((j>>(i-1)&1)==0)
                {
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=1;k<n;k++)
                    {

                        if((j>>(k-1)&1)==1)
                        {
                            dp[i][j]=Math.min(dp[i][j],cost[i][k]+dp[k][j^(1<<(k-1))]);
                        }
                    }
                }
            }
        System.out.println(dp[0][col-1]);
    }
}
