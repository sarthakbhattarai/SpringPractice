class Node{
    int data;
    Node left;
    Node right;


    public Node(int i) {
        this.data = i;
    }
}





public class BinaryTree {

    Node root;
    public void insert(int i) {

        root=insertRec(root,i);
    }

    public Node insertRec(Node root,int i){
        if(root==null)
            root = new Node(i);
        else if(i<root.data)
            root.left=insertRec(root.left,i);
        else if(i>root.data)
            root.right=insertRec(root.right,i);

        return root;
    }


    public void inOrer(){
        inOrerRec(root);
    }

    public void preOrer(){
        preOrerRec(root);
    }

    public void postOrer(){
        postOrerRec(root);
    }


    public void inOrerRec(Node root){

        if(root!=null){
            inOrerRec(root.left);
            System.out.print(root.data+" ");
            inOrerRec(root.right);
        }


    }


    public void preOrerRec(Node root){

        if(root!=null){
            System.out.print(root.data+" ");
            inOrerRec(root.left);
            inOrerRec(root.right);
        }


    }

    public void postOrerRec(Node root){

        if(root!=null){
            inOrerRec(root.right);
            System.out.print(root.data+" ");
            inOrerRec(root.left);

        }


    }







}
