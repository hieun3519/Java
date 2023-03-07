package binarytree;

// left child is smaller than the parent
// left most is the smallest value
// right child is larger than the parent
// right most is the largest value
// time complexity O(log n)

public class node {

    int data;
    node left;
    node right;

    public node(int data) {
        this.data = data;
    }
}
