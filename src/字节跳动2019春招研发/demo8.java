package 字节跳动2019春招研发;

import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int e=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==e);
            else{
                e=(int)Math.ceil((e+arr[i])/2.0);
            }
        }
        System.out.println(e);
    }
}
