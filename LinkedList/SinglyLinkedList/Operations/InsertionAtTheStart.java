package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

import java.util.Scanner;

public class InsertionAtTheStart {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before adding new element at the start : ");
        Traversal.traverseAndPrint(head);

        System.out.println("Enter the element to be added at the start of the list : ");
        Node newNode = new Node(new Scanner(System.in).nextInt());

        head = insertElementAtTheStart(newNode, head);

        System.out.println("The List after adding the new element at the start of the list is : ");
        Traversal.traverseAndPrint(head);
    }

    public static Node insertElementAtTheStart(Node newNode, Node head){
        newNode.nextNode = head;
        return newNode;
    }
}
