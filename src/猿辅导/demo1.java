package 猿辅导;

import java.util.Arrays;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            sort(arr);
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }

    public static void sort(int[] arr)
    {
        int half=arr.length/2-1;
        int[] copy= Arrays.copyOf(arr,arr.length);
        int i=0,j=half+1;
        int k=0;
        while(k<arr.length)
        {
            arr[k++]=copy[j++];
            if(i<=half)
            {
                arr[k++]=copy[i++];
            }
        }

    }
}
