class Node
{
	int val;
	Node next;
	public Node(int v)
	{
		this.val=v;
		this.next=null;
	}
}

class Linkedlist
{
	Node head;
	Node tail;
	public Linkedlist()
	{
		this.head=null;
		this.tail=null;

	}

	public void addfirst(int v)
	{

		Node newnode=new Node(v);
		newnode.next=this.head;
		this.head=newnode;
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

	public void display()
	{
		Node temp=this.head;

		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
}
public class palindromelist
{
	public static boolean palindrome(Node head)
	{
		Linkedlist l2=new Linkedlist();

		Node temp=head;
		int l=0;
		while(temp!=null)
		{
			l2.addfirst(temp.val);
			l+=1;
			temp=temp.next;
		}

		int count=0;
		Node t=l2.head;
		while(head!=null && t!=null)
		{
			if(head.val==t.val)
			{
				count+=1;
			}
			head=head.next;
			t=t.next;
		}
		if(l==count)
		{
			return true;
		}
		return false;

	}
	public static void main(String args[])
	{
		Linkedlist l=new Linkedlist();
		l.add(1);
		l.add(2);
		l.add(1);
		l.display();

		System.out.println(palindrome(l.head));


	}
}