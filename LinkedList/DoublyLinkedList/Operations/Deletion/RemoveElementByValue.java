package LinkedList.DoublyLinkedList.Operations.Deletion;

import LinkedList.DoublyLinkedList.Node;
import LinkedList.DoublyLinkedList.Operations.Traversal;

import java.util.Scanner;

public class RemoveElementByValue {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before deletion : ");
        Traversal.traverseFromStartToEnd(head);
        Traversal.traverseFromEndToStart(getLastNode(head));

        System.out.println("Enter the element to be removed from the list : ");
        int value = new Scanner(System.in).nextInt();

        head = removeElementByValue(head,value);

        System.out.println(String.format("The list after removing %d is ", value));
        Traversal.traverseFromStartToEnd(head);
        Traversal.traverseFromEndToStart(getLastNode(head));
    }

    private static Node getLastNode(Node head){
        Node pointer = head;
        while (pointer.nextNode != null){
            pointer = pointer.nextNode;
        }
        return pointer;
    }

    public static Node removeElementByValue(Node head, int value){
        Node pointer = head;
        if(head.value == value){
            Node nextNode = head.nextNode;
            nextNode.previousNode = null;
            return nextNode;
        }
        else{
            while(pointer.nextNode.value != value){
                pointer = pointer.nextNode;
            }

            Node nextNode = pointer.nextNode.nextNode;
            pointer.nextNode = nextNode;
            nextNode.previousNode = pointer;
        }
        return head;
    }
}
