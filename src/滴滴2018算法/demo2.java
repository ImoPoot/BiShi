package 滴滴2018算法;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        boolean[][] mark=new boolean[m][n];
        int action=sc.nextInt();
        int res=0;
        for(int i=0;i<action;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            mark[x][y]=true;
            if(x>0&&mark[x-1][y])
            {
                System.out.println(res);
                continue;
            }
            if(x<m-1&&mark[x+1][y])
            {
                System.out.println(res);
                continue;
            }
            if(y>0&&mark[x][y-1])
            {
                System.out.println(res);
                continue;
            }
            if(y<n-1&&mark[x][y+1])
            {
                System.out.println(res);
                continue;
            }
            System.out.println(++res);
        }
    }
}
