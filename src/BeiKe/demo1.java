package BeiKe;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String[] split=new String[4];
            for(int j=0;j<4;j++)
            {
                split[j]=sc.next();
            }
            int countleft=0;
            countleft+=whowin(split[0],split[2])?1:0;
            countleft+=whowin(split[0],split[3])?1:0;
            int countright=0;
            countright+=whowin(split[1],split[2])?1:0;
            countright+=whowin(split[1],split[3])?1:0;
            if(countleft>countright)
                System.out.println("left");
            else if(countleft<countright)
                System.out.println("right");
            else System.out.println("same");
        }
    }

    public static boolean whowin(String s1,String s2)
    {
        if((s1.equals("S")&&s2.equals("J"))||(s1.equals("J")&&s2.equals("B"))||(s1.equals("B")&&s2.equals("S")))
        {
            return true;
        }
        else  return  false;
    }
}

