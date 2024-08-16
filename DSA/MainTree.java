
public class MainTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        System.out.print("Inorder Print: ");
        tree.inOrer();
        System.out.println();
        System.out.print("Preorder Print: ");
        tree.preOrer();
        System.out.println();
        System.out.print("Postorder Print: ");
        tree.postOrer();

    }

}
