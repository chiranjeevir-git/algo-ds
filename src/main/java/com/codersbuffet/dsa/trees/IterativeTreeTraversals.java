package com.codersbuffet.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Tree references  - https://cs-people.bu.edu/tvashwin/cs112_spring09/lab06.html
public class IterativeTreeTraversals {

    public void preOrderTraversal(Node root) {
        System.out.println("preOrderTraversal\n");
        // root, left, right

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node curr = stack.pop();

            System.out.println(curr.getValue());

            if (curr.getRight() != null)
                stack.push(curr.getRight());


            if (curr.getLeft() != null)
                stack.push(curr.getLeft());
        }

    }


    public void postOrderTraversal(Node root) {
        System.out.println("postOrderTraversal\n");
        // left, right, root

        Stack<Node> nodeStack = new Stack<>();
        Stack<Integer> dataStack =  new Stack<>();

        Node curr = root;
        nodeStack.push(root);

        while (!nodeStack.isEmpty()){

            curr = nodeStack.pop();
            dataStack.push(curr.getValue());

            if(curr.getLeft()!=null)
                nodeStack.push(curr.getLeft());

            if(curr.getRight()!=null)
                nodeStack.push(curr.getRight());

        }

        while (!dataStack.isEmpty()){
            System.out.println(dataStack.pop());
        }


    }

    public void inOrderTraversal(Node root) {
        System.out.println("inOrderTraversal\n");
        // left, root, right

        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (!stack.isEmpty() || curr!=null){

            if(curr!=null){

                stack.push(curr);
                curr=curr.getLeft();

            } else {

                curr = stack.pop();
                System.out.println(curr.getValue());
                curr = curr.getRight();
            }
        }

    }

    public void bfsTraversal(Node root) {
        System.out.println("bfsTraversal\n");
        //each horizontal level iteration

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){

            Node curr = queue.poll();
            System.out.println(curr.getValue());

            if(curr.getLeft()!=null)
                queue.offer(curr.getLeft());

            if(curr.getRight()!=null)
                queue.offer(curr.getRight());
        }
    }

}
