class Node{
    int val;
    Node next;
    Node prev;
    public Node(int v)
    {
        this.val=v;
        this.next=null;
        this.prev=null;
    }
}

class DoubleLinked
{
    Node head;
    Node tail;
    public DoubleLinked()
    {
        this.head=null;
        this.tail=null;
    }

    public void add(int v)
    {
        if(this.head==null)
        {
            this.head=new Node(v);
            this.tail=this.head;

        }
        else{
            Node newnode=new Node(v);
            this.tail.next=newnode;
            newnode.prev=this.tail;
            this.tail=this.tail.next;
        }

    }

    public void display()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void reversedisplay()
    {
        Node temp=this.tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void addfirst(int v)
    {
        Node newnode=new Node(v);
        newnode.next=this.head;
        this.head.prev=newnode;
        this.head=newnode;
    }
    
    public void insert(int p,int val)
    {
        if(p==1)
        {
            addfirst(val);
        }
        else{
            int it=p-2;
            Node temp=this.head;

            for(int i=1;i<=it;i++)
            {
                temp=temp.next;
            }

            Node newnode=new Node(val);
            newnode.next=temp.next;
            temp.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    public void removefirst()
    {
        this.head=this.head.next;

    }
    public void remove()
    {
        Node temp=this.head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void delete(int p)
    {
        if(p==1)
        {
            removefirst();

        }
        else{
            int it=p-2;
            Node temp=this.head;
            for(int i=1;i<=it;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

    }   
}

public class doublylinkedlist
{
    public static void main(String args[])
    {
        DoubleLinked d=new DoubleLinked();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.display();
        d.reversedisplay();
        d.addfirst(9);
        d.display();
        d.insert(3,50);
        d.display();
        d.removefirst();
        d.display();
        d.remove();
        d.display();
        d.delete(3);
        d.display();
    }
}
