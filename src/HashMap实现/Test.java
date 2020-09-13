package HashMap实现;

class Node<Key,Value>{
    Key key;
    Value value;
    Node next;
    public Node(Key key,Value value)
    {
        this.key=key;
        this.value=value;
    }

    @Override
    public boolean equals(Object obj) {

        return key==obj;
    }
}

 class MyMap<Key,Value> {
    Node<Key,Value>[] tong=new Node[16];
    public MyMap()
    {

    }
    Value get(Key key)
    {
        int index=Math.abs(key.hashCode())%16;
        Node x=tong[index];
        if(x==null)
            return null;
        else {
            while(x!=null)
            {
                if(x.equals(key))
                    return (Value)x.value;
                else x=x.next;
            }
            return null;
        }
    }

    void put(Key key,Value value)
    {
        int hashcode=Math.abs(key.hashCode()) ;

        int index=hashcode%16;
        Node temp=new Node(key,value);
        if(tong[index]==null)
        {
            tong[index]=temp;
        }
        else {
            Node x=tong[index];
            x.next=temp;
        }
    }
}

public class Test{
    public static void main(String[] args) {
        MyMap<String,Integer> map=new MyMap<>();
        map.put("zhangsc",23);
        System.out.println(map.get("zhangsc"));
    }
}
