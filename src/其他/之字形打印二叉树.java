package 其他;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class TreeNode{
    int val;
    public TreeNode(int val)
    {
        this.val=val;
    }
    TreeNode left;
    TreeNode right;
}
public class 之字形打印二叉树 {
    public static void main(String[] args) {
        List<TreeNode> list=new LinkedList<>();
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode node6=new TreeNode(6);
        TreeNode node7=new TreeNode(7);
        list.add(node1);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        node4.left=new TreeNode(8);
        node7.right=new TreeNode(9);
        int level=0;
        int size=1;
        while(!list.isEmpty())
        {
            size=list.size();
            for(int i=0;i<size;i++)
            {
                if(level%2==0)
                {
                    TreeNode temp=list.remove(0);
                    System.out.println(temp.val+" ");
                    if(temp.left!=null)
                    {
                        list.add(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        list.add(temp.right);
                    }
                }
                else {
                    TreeNode temp=list.remove(list.size()-1);
                    System.out.println(temp.val);
                    if(temp.right!=null)
                    {
                        list.add(0,temp.right);
                    }
                    if(temp.left!=null)
                    {
                        list.add(0,temp.left);
                    }
                }
            }
            level++;
        }
    }
}
