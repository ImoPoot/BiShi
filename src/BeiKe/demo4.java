package BeiKe;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[2*n];
        int[] arr2=new int[2*n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int sm=0,max=0;
        int p=n-1,q=n;
        while(p>=0&&q<2*n)
        {
            if(arr1[p]<=arr1[q])
            {
                sm-=arr1[p];
                max=Math.min(max,sm);
                sm+=arr2[p];
                p--;
            }
            else {
                sm-=arr1[q];
                max=Math.min(sm,max);
                sm+=arr2[q];
                q++;
            }
        }
        while(p>=0||q<2*n)
        {
            if(p>=0)
            {
                sm-=arr1[p];
                max=Math.min(sm,max);
                sm+=arr2[p];
                p--;
            }
            else {
                sm-=arr1[q];
                max=Math.min(sm,max);
                sm+=arr2[q];
                q++;
            }
        }
        System.out.println(Math.abs(max)+1);
    }
}
