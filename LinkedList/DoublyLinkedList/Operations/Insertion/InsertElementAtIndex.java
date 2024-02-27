package LinkedList.DoublyLinkedList.Operations.Insertion;

import LinkedList.DoublyLinkedList.Node;
import LinkedList.DoublyLinkedList.Operations.Iteration.Traversal;

import java.util.Scanner;

public class InsertElementAtIndex {
    public static void main(String[] args) {

        Node head = Node.init();

        System.out.println("Linked list before adding a new node");
        Traversal.traverseFromStartToEnd(head);

        System.out.println("Enter the value of the node : ");
        Node newNode = new Node(new Scanner(System.in).nextInt());

        System.out.println("Enter the index, where the element has to be inserted : ");
        int index = new Scanner(System.in).nextInt();

        insertElementAtIndex(head, newNode, index);
    }

    private static void insertElementAtIndex(Node head, Node newNode, int index) {

        if(index == 0){
            head.previousNode = newNode;
            newNode.previousNode = null;
            newNode.nextNode = head;
            Traversal.traverseFromStartToEnd(newNode);
            return;
        }
        Node currentNode = head;
        for(int i = 0 ; i < index; i++){
            currentNode = currentNode.nextNode;
        }

        newNode.nextNode = currentNode.nextNode;
        newNode.previousNode = currentNode;
        currentNode.nextNode = newNode;


        Traversal.traverseFromStartToEnd(head);
    }
}
