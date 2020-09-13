package 猿辅导;

import java.util.Scanner;

public class demo3 {
    public static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++)
        {
            min=Integer.MAX_VALUE;
            String line=sc.nextLine();
            String[] words=line.split(" ");
            int x=0,y=0;
            int lengthA=words[0].length();
            int lengthB=words[1].length();
            int lengthC=words[2].length();
            backTrace(words[0],words[1],words[2],1,0,1,1,0);
            backTrace(words[0],words[1],words[2],0,1,1,1,1);
            System.out.println(min);
            System.out.println(min<=Integer.parseInt(words[3])?1:0);
        }
    }

    public static void backTrace(String a,String b,String c,int x,int y,int z,int count,int leftOrright){
        if(z==c.length()+1)
        {
            min=Math.min(min,count);
            return;
        }
        if(x==a.length()+1||y==b.length()+1)
        {
            return;
        }
        if(leftOrright==0)
        {
            int tempx=x-1,tempz=z-1;
            if(a.charAt(tempx)==c.charAt(tempz))
            {
                x++;
                z++;
                backTrace(a,b,c,x,y,z,count,0);
                x--;
                z--;
                y++;
                z++;
                backTrace(a,b,c,x,y,z,count+1,1);
                y--;
                z--;
            }
            else {
                return;
            }
        }
        else {
            int tempy=y-1,tempz=z-1;
            if(b.charAt(tempy)==c.charAt(tempz))
            {
                y++;
                z++;
                backTrace(a,b,c,x,y,z,count,1);
                y--;z--;
                x++;z++;
                backTrace(a,b,c,x,y,z,count+1,0);
                x--;z--;
            }
            else {
                return;
            }
        }
    }
}
