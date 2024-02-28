package LinkedList.SinglyLinkedList.DSA;

import LinkedList.SinglyLinkedList.Node;

import java.util.Stack;

public class ReversalOfLinkedList {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.println("The List before reversing : ");
        printList(head);

        Node newHead = reverseList(head);
        System.out.println("The list after reversing : ");
        printList(newHead);


        Node stackHead = reverseListUsingStack(head);
        System.out.println("The list after reversing using stacks : ");
        printList(stackHead);
    }

    // 2 -> 3

    public static Node reverseList(Node head){
        Node previousNode = null;
        Node currentNode = head;

        while(currentNode != null){
            Node nextNode = currentNode.nextNode;

            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static Node reverseListUsingStack(Node head){
        Stack<Integer> nodeStack = new Stack<>();
        Node currentNode = head;
        while(currentNode != null){
            nodeStack.push(currentNode.value);
            currentNode = currentNode.nextNode;
        }

        Node newHead = new Node(Integer.MIN_VALUE);
        Node previousNode = newHead;
        while (!nodeStack.isEmpty()){
            Node node = new Node(nodeStack.pop());
            previousNode.nextNode = node;
            previousNode = node;
        }

        previousNode.nextNode = null;
        return newHead.nextNode;
    }


    private static void printList(Node head){
        while(head != null){
            System.out.printf("%d -> ",head.value);
            head = head.nextNode;
        }
        System.out.printf("null\n");
    }
}
