class linkedlist
{

    class node
    {
        int val;
        node next;
        public node(int n)
        {
            this.val=n;
            this.next=null;
            
        }
    }
    public static node head=null;
    void addnode(int v)
    {
        if(head==null)
        {
            head=new node(v);
        }
        else{
            node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new node(v);
        }
    }

    void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        linkedlist l=new linkedlist();
        l.addnode(0);
        l.addnode(1);
        l.addnode(2);
        l.display();

    }
}