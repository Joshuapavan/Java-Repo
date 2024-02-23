package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.Node;

public class Traversal {
    public static void main(String[] args) {
        Node currentNode = Node.init();
        traverseAndPrint(currentNode);
    }

    public static void traverseAndPrint(Node currentNode){
        int index = 0;
        while(currentNode != null){
            System.out.printf("[%d] = %d -> ",index,currentNode.value);
            currentNode = currentNode.nextNode;
            index++;
        }
    }
}
