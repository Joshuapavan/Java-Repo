package LinkedList.SinglyLinkedList.Operations.Deletion;

import LinkedList.SinglyLinkedList.Node;
import LinkedList.SinglyLinkedList.Operations.Iteration.Traversal;

import java.util.Scanner;

public class RemoveElementByValue {
    public static void main(String[] args) {
        Node head = Node.init();
        System.out.println("The Linked list before deletion");
        Traversal.traverseAndPrint(head);
        System.out.println("Enter the value to be deleted");
        int value = new Scanner(System.in).nextInt();

        head = removeElementByValue(head, value);

        System.out.println(String.format("The list after removing the element with %d value is : ",value));
        Traversal.traverseAndPrint(head);
    }

    public static Node removeElementByValue(Node head, int value){
        if(head.value == value){
            return head.nextNode;
        }
        else{
            Node pointer = head;
            while(pointer.nextNode.value != value){
                pointer = pointer.nextNode;
            }
            pointer.nextNode = pointer.nextNode.nextNode;
        }
        return head;
    }

}
