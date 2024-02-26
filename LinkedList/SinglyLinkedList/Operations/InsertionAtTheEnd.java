package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

import java.util.Scanner;

public class InsertionAtTheEnd {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before inserting an element at the end of the list is : ");
        Traversal.traverseAndPrint(head);

        System.out.println("Enter the element to be added in the end of the list : ");
        Node newNode = new Node(new Scanner(System.in).nextInt());

        addElementAtTheEnd(newNode, head);
        System.out.println("The List after adding the new element to the end is  : ");
        Traversal.traverseAndPrint(head);
    }

    public static void addElementAtTheEnd(Node newNode, Node head) {
        Node pointer = head;
        while (pointer.nextNode != null) {
            pointer = pointer.nextNode;
        }

        pointer.nextNode = newNode;
        newNode.nextNode = null;
    }
}
