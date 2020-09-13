package 华为;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int[][] arr=new int[][]{{8,4,1},{6,5,2}};
        int m=2,n=3;
        boolean[][] mark=new boolean[m][n];
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                dp[i][j]=1;
        }
        backTrace(arr,mark,0,0,dp);
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                max=Math.max(max,dp[i][j]);
        }
        System.out.println(max);


    }

    public static void backTrace(int[][] arr,boolean[][] mark, int x,int y,int[][] dp)
    {
            if(x>0&&!mark[x-1][y]&&arr[x-1][y]<arr[x][y])
            {
                mark[x-1][y]=true;
                dp[x-1][y]=Math.max(dp[x-1][y],dp[x][y]+1);
                backTrace(arr,mark,x-1,y,dp);
            }
            if(x<arr.length-1&&!mark[x+1][y]&&arr[x+1][y]<arr[x][y])
            {
                mark[x+1][y]=true;
                dp[x+1][y]=Math.max(dp[x+1][y],dp[x][y]+1);
                backTrace(arr,mark,x+1,y,dp);
            }
            if(y>0&&!mark[x][y-1]&&arr[x][y-1]<arr[x][y])
            {
                mark[x][y-1]=true;
                dp[x][y-1]=Math.max(dp[x][y-1],dp[x][y]+1);
                backTrace(arr,mark,x,y-1,dp);
            }
            if(y<arr[0].length-1&&!mark[x][y+1]&&arr[x][y+1]<arr[x][y])
            {
                mark[x][y+1]=true;
                dp[x][y+1]=Math.max(dp[x][y+1],dp[x][y]+1);
                backTrace(arr,mark,x,y+1,dp);
            }
    }
}
