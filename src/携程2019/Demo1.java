package 携程2019;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int []order=new int[n];
        int[] in=new int[n];
        int[] out=new int[n];
        for(int i=0;i<n;i++){
            order[i]=sc.nextInt();
            in[i]=sc.nextInt();
            out[i]=sc.nextInt();
        }
        int x=help(in,target,true);
        int y=help(out,target,false);
        if(x<y)
            System.out.println("null");
        else{
            for(int i=y;i<=x&&i>=0&&i<n;i++)
            {
                System.out.println(order[i]);
            }
        }
    }

    public static int help(int[] arr,int target,boolean isLeft)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else right=mid-1;
        }
        if(isLeft)
            return left-1;
        else return left;
    }
}
