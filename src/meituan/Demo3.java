package meituan;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int[] pre=new int[n];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]^i;
        }
        int res=0;
        for(int j=2;j<=n;j++)
        {
            int a=n/j;
            int b=n%j;
            if(a%2==1)
                res^=pre[j-1];
            for(int i=1;i<=b;i++)
            {
                res^=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            res^=array[i];
        }
        System.out.println(res);
    }
}
