public class list {

    class Node{
        int val;
        Node next;
        public Node(int v)
        {
            this.val=v;
            this.next=null;
        }
    }

    class linked{
        Node head;
        Node tail;

        public linked()
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
                this.tail.next=new Node(v);
                this.tail=this.tail.next;

            }
        }

        public void addfirst(int v)
        {
            Node newnode=new Node(v);
            newnode.next=this.head;
            this.head=newnode;
        }

        public void display()
        {
            Node temp=this.head;
            while(temp!=null)
            {
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
        }

        public void insert(int pos,int val)
        {
            Node temp=this.head;
            if(pos==1)
            {
                Node newnode=new Node(val);
                newnode.next=this.head;
                this.head=newnode;
            }
            for(int i=1;i<=pos-2;i++)
            {
                if(temp!=null)
                {
                    temp=temp.next;
                }
                

            }
            if(temp==null)
            {
                System.out.println("invalid position");
                return;
            }
            Node newnode=new Node(val);
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }

    public static void main(String args[])
    {
        list l=new list();
        linked l1=l.new linked();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addfirst(9);
        l1.insert(4,77);
        // this will insert the value at a particular position
        l1.display();


    }
    
}
