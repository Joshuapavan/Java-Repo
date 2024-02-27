package LinkedList.DoublyLinkedList.Operations.Insertion;

import LinkedList.DoublyLinkedList.Node;
import LinkedList.DoublyLinkedList.Operations.Iteration.Traversal;

import java.util.Scanner;

public class InsertElementAtStart {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before adding an element at the start : ");
        Traversal.traverseFromStartToEnd(head);

        System.out.println("Enter the element to be added at the start : ");
        Node newNode = new Node(new Scanner(System.in).nextInt());

        head = insertElementAtStart(head, newNode);

        System.out.println("The list after adding the element at the starting is : ");
        Traversal.traverseFromStartToEnd(head);
    }

    public static Node insertElementAtStart(Node head, Node newNode){
        newNode.nextNode = head;
        newNode.previousNode = null;
        return newNode;
    }
}
