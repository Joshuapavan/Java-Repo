package LinkedList.DoublyLinkedList.Operations;

import LinkedList.DoublyLinkedList.Node;


public class Traversal {
    public static void main(String[] args) {
        Node currentNode = Node.init();

        System.out.println("Traversal from start to end : ");
        traverseFromStartToEnd(currentNode);
        System.out.println("Traversal from end to start : ");
        traverseFromEndToStart(currentNode);
    }

    public static void traverseFromStartToEnd(Node currentNode){
        while(currentNode != null){
            System.out.printf("%d -> ",currentNode.value);
            currentNode = currentNode.nextNode;
        }
        System.out.println("null");
    }

    public static void traverseFromEndToStart(Node currentNode){
        Node lastNode = getlastNode(currentNode);
        while (lastNode != null){
            System.out.printf("%d -> ",lastNode.value);
            lastNode = lastNode.previousNode;
        }
        System.out.println("null");
    }

    private static Node getlastNode(Node currentNode) {
        while (currentNode.nextNode != null){
            currentNode = currentNode.nextNode;
        }

        return currentNode;
    }

}
