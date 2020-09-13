package 华为;

import java.util.Scanner;

class Node1{
    int price;
    int look;
    public Node1(int look,int price)
    {
        this.look=look;
        this.price=price;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //完美长度
        int k=sc.nextInt();
        Node1[] perfect=new Node1[k];
        for(int i=0;i<k;i++)
        {
            int price=sc.nextInt();
            int look=sc.nextInt();
            perfect[i]=new Node1(look,price);
        }
        int n=sc.nextInt();
        Node1[] line=new Node1[n];
        for(int i=0;i<n;i++)
        {
            int price=sc.nextInt();
            int look=sc.nextInt();
            line[i]=new Node1(look,price);
        }
        int[][] dp=new int[k][56];
        dp[0][perfect[0].look*10+perfect[0].price]=1;
        int x=0;
        for(int j=1;j<k;j++)
        {
            for(int c=0;c<56;c++)
            {
                dp[j][c]=dp[x][c];
            }
            dp[j][perfect[j].look*10+perfect[j].price]=j+1;
            x=dp[x][perfect[j].look*10+perfect[j].price];
        }
        System.out.println(search(line,k,n,dp)+1);
    }

    public static int search(Node1[] line,int k,int n,int[][] dp)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            j=dp[j][line[i].look*10+line[i].price];
            if(j==k)
            {
                return i-k+1;
            }
        }
        return -1;
    }
}
