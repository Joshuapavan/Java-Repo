package LinkedList.SinglyLinkedList.DSA;

import LinkedList.SinglyLinkedList.Node;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        Node head = createDuplicatedList();

        System.out.println("The list after initialization is : ");
        printList(head);

        head = removeDuplicates(head);
        System.out.println("The list after removing the duplicated values : ");
        printList(head);
    }

    public static Node removeDuplicates(Node head){

        if(head.nextNode == null){
            return head;
        }

        Node currentNode = head;
        Node pointerNode = currentNode.nextNode;

        while (pointerNode != null){
            if(pointerNode.value == currentNode.value){
                pointerNode = pointerNode.nextNode;
                continue;
            }

            currentNode.nextNode = pointerNode;
            currentNode = pointerNode;
            pointerNode = pointerNode.nextNode;
        }
        return head;
    }

    private static void printList(Node head){
        while(head != null){
            System.out.printf("%d -> ",head.value);
            head = head.nextNode;
        }
        System.out.print("null\n");
    }

    private static Node createDuplicatedList(){
        // 1 -> 1 -> 2 -> 2 -> 3                =          1 -> 2 -> 3
        Node firstNode = new Node(1);
        Node secondNode = new Node(1);
        Node thirdNode = new Node(2);
        Node fourthNode = new Node(2);
        Node fifthNode = new Node(3);

        firstNode.nextNode = secondNode;
        secondNode.nextNode = thirdNode;
        thirdNode.nextNode = fourthNode;
        fourthNode.nextNode = fifthNode;
        fifthNode.nextNode = null;

        return firstNode;
    }
}
