public class binarytrees {

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

    class Binarytree{

        Node root;
        public Binarytree()
        {
            this.root=null;
        }

        public void addnode(int v)
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
                        if(temp.left==null)
                        {
                            temp.left=new Node(v);
                            break;
                        }
                        else{
                            temp=temp.left;
                        }
                    }
                    else{
                        if(temp.right==null)
                        {
                            temp.right=new Node(v);
                            break;
                        }
                        else{
                            temp=temp.right;
                        }
                    }
                }
            }
        }
    }

    public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.val+" ");
            preorder(root.left);
            preorder(root.right);

        }
    }

    public static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+" ");
        }
    }

    public static void inorder(Node root)
    {
        if(root!=null)
        {
            preorder(root.left);
            System.out.print(root.val+" ");
            preorder(root.right);
        }
    }



    public static void main(String args[])
    {
        binarytrees bi=new binarytrees();
        Binarytree b=bi.new Binarytree();
        b.addnode(5);
        b.addnode(4);
        b.addnode(6);
        b.addnode(2);
        b.addnode(7);
        b.addnode(3);

        preorder(b.root);
        System.out.println();
        inorder(b.root);

    }
    
}
