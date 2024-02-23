package LinkedList.DoublyLinkedList;

public class Node {

    public int value;

    public Node previousNode;
    public Node nextNode;

    public Node(int value){
        this.value = value;
    }

    public static Node init(){

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);

        firstNode.previousNode = null;
        firstNode.nextNode = secondNode;

        secondNode.previousNode = firstNode;
        secondNode.nextNode = thirdNode;

        thirdNode.previousNode = secondNode;
        thirdNode.nextNode = fourthNode;

        fourthNode.previousNode = thirdNode;
        fourthNode.nextNode = fifthNode;

        fifthNode.previousNode = fourthNode;
        fifthNode.nextNode = sixthNode;

        sixthNode.previousNode = fifthNode;
        sixthNode.nextNode = null;

        return firstNode;
    }


}
