package LinkedList.SinglyLinkedList.DSA;

import LinkedList.SinglyLinkedList.Node;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        // head1 = odd numbers till 5
        // head2 = even numbers till 5
        Node head1 = MergeTwoSortedLists.initializeSortedList1();
        Node head2 = MergeTwoSortedLists.initializeSortedList2();

        System.out.println("The lists before sorting are : ");
        printList(head1);
        printList(head2);

        Node head = mergeTwoSortedList(head1, head2);

        System.out.println("The list after merging is : ");
        printList(head);
    }

    public static Node mergeTwoSortedList(Node head1, Node head2){
        Node headNode = new Node(Integer.MIN_VALUE);
        Node returnNode = headNode;

        while(head1 != null && head2 != null){
            if(head1.value < head2.value){
                headNode.nextNode = head1;
                head1 = head1.nextNode;
            }
            else{
                headNode.nextNode = head2;
                head2 = head2.nextNode;
            }
            headNode = headNode.nextNode;
        }

        if(head1 == null){
            headNode.nextNode = head2;
        }
        else if(head2 == null){
            headNode.nextNode = head1;
        }

        return returnNode.nextNode;
    }







    /*
            Node newHead = new Node(Integer.MIN_VALUE);

        Node headNode = newHead;

        while(head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                newHead.nextNode = head1;
                head1 = head1.nextNode;
            } else {
                newHead.nextNode = head2;
                head2 = head2.nextNode;
            }
            newHead = newHead.nextNode;
        }

        if(head1 == null) {
            newHead.nextNode = head2;
        }
        else if(head2 == null){
            newHead.nextNode = head1;
        }

        return headNode.nextNode;
     */

    private static void printList(Node head){
        while(head != null){
            System.out.printf("%d -> ",head.value);
            head = head.nextNode;
        }
        System.out.println("null");
    }

    /*
    Initializes the head with the starting node and the returns the list with odd numbers
     */
    private static Node initializeSortedList1() {
        Node firstNode = new Node(1);
        Node thirdNode = new Node(3);
        Node fifthNode = new Node(5);

        firstNode.nextNode = thirdNode;
        thirdNode.nextNode = fifthNode;
        fifthNode.nextNode = null;

        return firstNode;
    }

    /*
    Initializes the head with the starting node and the returns the list with odd numbers
    */
    private static Node initializeSortedList2(){
        Node secondNode = new Node(2);
        Node fourthNode = new Node(4);

        secondNode.nextNode = fourthNode;
        fourthNode.nextNode = null;

        return secondNode;
    }
}

