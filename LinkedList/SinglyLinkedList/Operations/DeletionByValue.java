package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

import java.util.Scanner;

public class DeletionByValue {
    public static void main(String[] args) {
        Node headNode = Node.init();
        System.out.println("The Linked list before deletion");
        Traversal.traverseAndPrint(headNode);
        System.out.println("Enter the value to be deleted");
        int value = new Scanner(System.in).nextInt();
    }

}
