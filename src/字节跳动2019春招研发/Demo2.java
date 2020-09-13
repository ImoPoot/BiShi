package 字节跳动2019春招研发;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int distance=sc.nextInt();
        int[] position=new int[number];
        for(int i=0;i<number;i++)
        {
            position[i]=sc.nextInt();
        }
        long res=0;
        int left=0,right=2;
        while(right<number)
        {
            if(right-left<=2) right++;
            else if(position[right]-position[left]<=distance) right++;
            else {
                res+=cal(right-left-2);

            }
        }
        System.out.println(res%99997867);
    }

    public static long cal(int n)
    {
        return n*(n+1)/2;
    }
}
