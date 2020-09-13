package 字节跳动2019春招研发;

import javax.lang.model.type.UnionType;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Node{
    public int x;
    public int y;
    public Node(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj) {
        Node temp=(Node)obj;
        return x==temp.x&&y==temp.y;
    }

    @Override
    public int hashCode() {
        return x*10+y;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //测试用例数
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int max=0;
            //帧数
            int frames=sc.nextInt();
            Map<Node,Integer>[] sets=new Map[frames];
            for(int j=0;j<frames;j++)
            {
                sets[j]=new HashMap<Node,Integer>();
                //特征数
                int x=sc.nextInt();
                for(int k=0;k<x;k++)
                {
                    int m=sc.nextInt();
                    int n=sc.nextInt();
                    Node cur=new Node(m,n);
                    if(j>0&&sets[j-1].containsKey(cur))
                    {
                        sets[j].put(cur,sets[j-1].get(cur)+1);
                        max=Math.max(max,sets[j].get(cur));
                    }
                    else sets[j].put(cur,1);
                }
            }
            System.out.println(max);
        }
    }
}
