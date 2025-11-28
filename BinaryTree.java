


public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    Node root;
    BinaryTree(int data){
        root = new Node(data);
    }
    public void insertLeft(Node root,int data){
        Node n = new Node(data);
        root.left=n;
    }
    public void insertRight(Node root,int data){
        Node n = new Node(data);
        root.right=n;
    }
    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root != null){

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root != null){

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        bt.insertLeft(bt.root,15);
        bt.insertRight(bt.root,20);
        bt.insertLeft(bt.root.left,11);
        bt.insertRight(bt.root.left,13);
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
    }
}
