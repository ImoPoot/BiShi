package BeiKe;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int max=1;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<=n-(j-i);j++)
            {
                int length=j-i;
                String subString1=s.substring(i,i+length);
                String subString2=s.substring(j,j+length);
                if(subString1.equals(subString2))
                {
                    max=Math.max(max,length);
                }
            }
        System.out.println(n-max+1);
    }
}
