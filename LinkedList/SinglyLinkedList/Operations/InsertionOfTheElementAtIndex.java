package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

import java.util.Scanner;

public class InsertionOfTheElementAtIndex {
    public static void main(String[] args) {
        Node currentNode = Node.init();

        System.out.println("Enter the value of the node");
        Node newNode = new Node(new Scanner(System.in).nextInt());
        System.out.println("Enter a index, where we need to insert the element (1-5)");
        int index = new Scanner(System.in).nextInt();
        insertElementAtIndex(currentNode, newNode,index);
    }

    public static void insertElementAtIndex(Node currentNode,Node newNode, int index){
        Node head = currentNode;
        for(int i = 0 ; i < index; i++){
            if(currentNode == null){
                System.out.println("linkedlist out of bounds");
            }
            currentNode = currentNode.nextNode;
        }
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;

        Traversal.traverseAndPrint(head);
    }

}
