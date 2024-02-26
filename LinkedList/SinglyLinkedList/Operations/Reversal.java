package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

public class Reversal {

    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("List before reversing : ");
        Traversal.traverseAndPrint(head);

        Node newHead = reverseList(head);

        System.out.println("List after reversing : ");
        Traversal.traverseAndPrint(newHead);
    }

    private static Node reverseList(Node head) {
        Node currentNode = head;
        Node previousNode = null;
        Node nextNode;

        while(currentNode != null){
            nextNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
