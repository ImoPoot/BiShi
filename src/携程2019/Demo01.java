package 携程2019;

import java.util.*;

class Node{
    public int order;
    public int time;
    public Node(int order,int time)
    {
        this.order=order;
        this.time=time;
    }
}
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        Node[] in=new Node[n];
        Node[] out=new Node[n];
        for(int i=0;i<n;i++)
        {
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            in[i]=new Node(x,y);
            out[i]=new Node(x,z);
        }
        Arrays.sort(in, new Comparator<Node>() {
            @Override
            public int compare(Node node, Node t1) {
                return node.time<t1.time?-1:1;
            }
        });
        Arrays.sort(out, new Comparator<Node>() {
            @Override
            public int compare(Node node, Node t1) {
                return node.time<t1.time?-1:1;
            }
        });

        int left=help2(in,target);
        int right=help(out,target);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<=left;i++)
        {
            set.add(in[i].order);
        }
        int count=0;
        List<Integer> list=new ArrayList<>();
        for(int i=right;i<n;i++)
        {
            if(set.contains(out[i].order)){
                System.out.println(out[i].order);
                count++;
            }
        }
        if(count==0)
            System.out.println("null");
    }

    public static int help(Node[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid].time==target)
            {
                while(mid>=1&&arr[mid].time==arr[mid-1].time)
                {
                    mid--;
                }
                return mid;
            }
            else if(arr[mid].time<target)
            {
                left=mid+1;
            }
            else right=mid-1;
        }
        return left;
    }

    public static int help2(Node[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid].time==target)
            {
                while(mid<arr.length-1&&arr[mid].time==arr[mid+1].time)
                {
                    mid++;
                }
                return mid;
            }
            else if(arr[mid].time<target)
            {
                left=mid+1;
            }
            else right=mid-1;
        }
        return right;
    }
}
