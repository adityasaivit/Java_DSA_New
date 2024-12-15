class Node
{
	int val;
	Node right;
	Node left;
	public Node(int v){
		this.val=v;
		this.right=null;
		this.left=null;
	}
}
class Binarytree{
	Node root;
	public Binarytree()
	{	
		this.root=null;
	}

	public void add(int v)
	{
		Node temp=this.root;
		if(root==null)
		{
			root=new Node (v);
		}
		else{
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
					else{
						temp.right=new Node(v);
						break;
					}
				}
			}
		}
	}
}


public class Inordertraversal
{
	public static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.val);
			inorder(root.right);
		}
	}
	public static void main(String args[])
	{
		Binarytree b=new Binarytree();
		b.add(5);
		b.add(3);
		b.add(8);

		inorder(b.root);
	}
}