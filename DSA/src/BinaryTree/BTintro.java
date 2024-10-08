package BinaryTree;

//public class BTintro {
//    public static void main(String[] args) {
//        System.out.println("RUN");
//    }
//}

class Node{
    int data;
    Node left;
    Node right;

     public Node (int val){
        data = val;
    }
    public void printLeft(){
        System.out.println("Root's Left Value : " + left.data );
    }

    public void printRight(){
        System.out.println("Root's Right Value : " + right.data );
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(10);
        root.right = new Node(20);
        System.out.println("Root Data : " + root.data);
        root.printLeft();
        root.printRight();
    }
}
