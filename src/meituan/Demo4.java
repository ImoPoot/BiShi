package meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();
            int[] mark=new int[n+1];
            boolean result=true;
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                if(x>n||x%2==0) {
                    //System.out.println("NO");
                    result=false;
                    break;
                }
                else
                {
                    mark[x]+=1;
                }
            }
            if(mark[1]!=(int)Math.ceil(n/2.0)||mark[n]!=1){
                //System.out.println("NO");
                result=false;
            }
            if(result) {
                for (int i = 3; i <= n; i += 2) {
                    if(i==n)
                    {
                        if(mark[1]!=i-1){
                            result=false;
                        }
                        break;
                    }
                    if (mark[i] == 0)
                        continue;
                    else {
                            for(int k=1;k<=mark[i];k++)
                            {
                                if(mark[1]<i-1){
                                    result=false;
                                    break;
                                }
                                else
                                {
                                    mark[1]++;
                                }
                            }
                        }
                }
            }
            System.out.println(result?"YES":"NO");
        }
    }
}
