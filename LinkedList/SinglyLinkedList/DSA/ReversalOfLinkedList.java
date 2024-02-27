package LinkedList.SinglyLinkedList.DSA;

import LinkedList.SinglyLinkedList.Node;

public class ReversalOfLinkedList {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before reversing : ");
        printList(head);

        head = reverseList(head);
    }

    // 2 -> 3

    public static Node reverseList(Node head){
        return head;
    }

    private static void printList(Node head){
        while(head != null){
            System.out.printf("%d -> ",head.value);
            head = head.nextNode;
        }
        System.out.printf("null\n");
    }
}
