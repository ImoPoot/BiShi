package 滴滴2018算法;

import java.math.BigDecimal;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            float r=sc.nextFloat();
            int n=sc.nextInt();
            System.out.println(digui(r,n));
        }
    }
    public static BigDecimal digui(float r,int n)
    {
        if(n==0)
            return BigDecimal.ONE;
        if(n==1)
            return new BigDecimal(r);
        BigDecimal temp=digui(r,n/2);
        if(n%2==0)
        {
            return  temp.multiply(temp);
        }
        else {
            return temp.multiply(temp).multiply(new BigDecimal(r));
        }
    }
}
