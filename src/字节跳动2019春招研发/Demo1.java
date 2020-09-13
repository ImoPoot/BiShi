package 字节跳动2019春招研发;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] strings=new String[n];
        for(int i=0;i<n;i++)
        {
            strings[i]=sc.nextLine();
        }
        for(String s:strings)
        {
            char[] arr=s.toCharArray();
            int[] nums=new int[arr.length];
            nums[0]=1;
            boolean[] mark=new boolean[arr.length];
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]==arr[i-1])
                    nums[i]=nums[i-1]+1;
                else  nums[i]=1;
            }
            int pre=0;
            for(int i=0;i<arr.length;i++) {
                if(nums[i]>2)
                    mark[i]=true;
            }int count=0;
            for(int i=0;i<arr.length;i++)
            {
                if(mark[i])
                    continue;
                else {
                    if(nums[i]==2)
                    {
                        if(nums[pre]==2)
                        {
                            mark[i]=true;
                            pre=i-1;
                            count=0;
                        }
                        else{
                            pre=i;
                            count=0;
                        }
                    }
                    else {
                        count++;
                        if(count>1)
                            pre=i;
                    }
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<arr.length;i++)
            {
                if(!mark[i])
                    sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
