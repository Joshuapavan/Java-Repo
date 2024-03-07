package LinkedList.SinglyLinkedList.DSA;

import LinkedList.SinglyLinkedList.Node;

public class IsListLooped {
    public static void main(String[] args) {
        Node head = initializeLoopedList();




    }

    private static Node initializeLoopedList(){
        // 1 -> 2 -> 3 -> 4 -> 2   [Here the 2 is the same node in the linked list]

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        firstNode.nextNode = secondNode;
        secondNode.nextNode = thirdNode;
        thirdNode.nextNode = fourthNode;
        fourthNode.nextNode = secondNode;

        return firstNode;
    }
}
