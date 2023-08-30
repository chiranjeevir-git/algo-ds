package com.codersbuffet.dsa.trees;

public class TreeTraversalMain {

    public static void main(String[] args) {

        Node root = new Node(10);
        Node n12 = new Node(12);
        Node n5 = new Node(5);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n11 = new Node(11);
        Node n2 = new Node(2);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        root.setLeft(n12); root.setRight(n5);

        n12.setLeft(n3); n12.setRight(n4);

        n5.setLeft(n11); n5.setRight(n2);

        n4.setLeft(n6); n4.setRight(n7);

        n2.setRight(n8);

        n2.setLeft(null);

        IterativeTreeTraversals iterativeTreeTraversals =  new IterativeTreeTraversals();

        iterativeTreeTraversals.postOrderTraversal(root);

        iterativeTreeTraversals.preOrderTraversal(root);

        iterativeTreeTraversals.inOrderTraversal(root);

        iterativeTreeTraversals.bfsTraversal(root);




    }
}