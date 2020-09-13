package 华为;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;
    public Node(int val)
    {
        this.val=val;
    }
}
public class Demo3 {
    public static int max;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node[] tree=new Node[n+1];
        int[][] child=new int[n+1][2];
        for(int i=1;i<=n;i++)
        {
            int index=sc.nextInt();
            int val=sc.nextInt();
            child[index][0]=sc.nextInt();
            child[index][1]=sc.nextInt();
            tree[index]=new Node(val);
        }
        Node root=tree[1];
        for(int i=1;i<=n;i++)
        {
            if(child[i][0]!=-1)
            {
                tree[i].left=tree[child[i][0]];
            }
            if(child[i][1]!=-1)
            {
                tree[i].right=tree[child[i][1]];
            }
        }
        dfs(root,0);
        System.out.println(max);
    }

    public static void dfs(Node root,int res)
    {
        res=res^root.val;
        max=Math.max(max,res);
        if(root.left!=null)
        {
            dfs(root.left,res);
        }
        if(root.right!=null)
        {
            dfs(root.right,res);
        }
    }
}
