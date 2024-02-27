package LinkedList.DoublyLinkedList.Operations.Insertion;

import LinkedList.DoublyLinkedList.Node;
import LinkedList.DoublyLinkedList.Operations.Iteration.Traversal;

import java.util.Scanner;

public class InsertElementAtEnd {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before the insertion of element at the end : ");
        Traversal.traverseFromStartToEnd(head);

        System.out.println("Enter the element to be added at the end of the list : ");
        Node newNode = new Node(new Scanner(System.in).nextInt());

        addElementAtEnd(head, newNode);

        System.out.println("The List after adding the element at the end of the list is : ");
        Traversal.traverseFromStartToEnd(head);
    }

    public static void addElementAtEnd(Node head, Node newNode){
        Node pointer = head;
        while(pointer.nextNode != null){
            pointer = pointer.nextNode;
        }

        pointer.nextNode = newNode;
        newNode.previousNode = pointer;
        newNode.nextNode = null;
    }
}
