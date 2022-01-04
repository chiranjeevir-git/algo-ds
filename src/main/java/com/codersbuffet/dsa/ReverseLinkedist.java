package com.codersbuffet.dsa;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;

    }

}

public class ReverseLinkedist {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);


        Node curr = root;
        Node temp, prev = null;
//1->2->3->4
        while (curr != null) {
            temp = curr.next; // 3
            curr.next = prev; //1
            prev = curr; //1
            curr = temp; //2

        }

        Node printcurr = root;
        while (prev != null) {
            System.out.println(prev.val);
            prev = prev.next;
        }


    }
}
