package binarytree;

public class main {
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new node(5));
        tree.insert(new node(6));
        tree.insert(new node(2));
        tree.insert(new node(9));
        tree.insert(new node(1));
        tree.insert(new node(4));
        tree.insert(new node(7));

        tree.remove(1);
        tree.display();

        System.out.println(tree.search(0));
    }
}
