class Node
{
	int val;
	Node left;
	Node right;
	public Node(int v)
	{
		this.val=v;
		this.left=null;
		this.right=null;
	}
}

class Binarytree
{
	Node root;
	public Binarytree()
	{
		this.root=null;
	}
	public void add(int v)
	{
		if(this.root==null)
		{
			this.root=new Node(v);
		}
		else{
			Node temp=this.root;
			while(true)
			{
				if(v<temp.val)
				{
					if(temp.left!=null)
					{
						temp=temp.left;
					}
					else{
						temp.left=new Node(v);
						break;
					}
				}
				else{
					if(temp.right!=null)
					{
						temp=temp.right;
					}
					else
					{
						temp.right=new Node(v);
						break;
					}

				}
			}
		}
	}
}
public class Preordertraversal
{
	public static void preorder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void main(String args[])
	{
		Binarytree b=new Binarytree();
		b.add(5);
		b.add(3);
		b.add(8);

		preorder(b.root);



	}
}