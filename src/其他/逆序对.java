package 其他;

import java.util.Arrays;
import java.util.Scanner;

public class 逆序对 {
    public static int[] help;
    public static int res=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[(int)Math.pow(2,n)];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        help=new int[arr.length];
        for(int k=0;k<m;k++)
        {
            res=0;
            int x=(int)Math.pow(2,arr2[k]);
            reverse(arr,x);
            int[] pre= Arrays.copyOf(arr,arr.length);
            mergeSort(arr,0,arr.length-1);
            arr=pre;
            System.out.println(res);
        }

    }
    public static void mergeSort(int[] arr,int left,int right)
    {
        if(left>=right)
            return;
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr,int left,int mid,int right)
    {
        for(int i=left;i<=right;i++)
        {
            help[i]=arr[i];
        }
        int lo=left,hi=mid+1;
        for(int k=left;k<=right;k++)
        {
            if(lo>mid)  arr[k]=help[hi++];
            else if(hi>right) arr[k]=help[lo++];
            else if(help[lo]<help[hi]) {
                arr[k]=help[lo++];
            }
            else if(help[lo]>help[hi]){
                arr[k]=help[hi++];
                res+=(mid-lo+1);
        }
            else {
                arr[k]=help[lo++];
            }
        }
    }

    public static void reverse(int[] arr,int n)
    {
        int length=arr.length;
        for(int i=0;i<=length-n;i+=n)
        {
            int start=i;
            int end=start+n-1;
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    }
}
