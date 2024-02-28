package LinkedList.SinglyLinkedList.DSA;

import LinkedList.SinglyLinkedList.Node;

public class SumOfValuesInAList {
    public static void main(String[] args) {
        Node head = Node.init();

        System.out.print("\nThe List is : ");
        printList(head);

        int sum = getSumOfTheList(head);
        System.out.println(String.format("The sum of the list is %d",sum));
    }

    public static int getSumOfTheList(Node head){
        int sum = 0;
        while (head != null){
            sum += head.value;
            head = head.nextNode;
        }
        return sum;
    }

    private static final void printList(Node head){
        while (head != null){
            System.out.printf("%d -> ",head.value);
            head = head.nextNode;
        }
        System.out.printf("null\n");
    }
}
