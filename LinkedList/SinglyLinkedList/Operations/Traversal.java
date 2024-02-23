package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

public class Traversal {
    public static void main(String[] args) {
        Node currentNode = Node.init();
        traverseAndPrint(currentNode);
    }

    public static void traverseAndPrint(Node currentNode){
        while(currentNode != null){
            System.out.printf("%d -> ",currentNode.value);
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }
}
