package LinkedList.SinglyLinkedList;

public class Node {
    public int value;
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



        firstNode.nextNode = secondNode;
        secondNode.nextNode = thirdNode;
        thirdNode.nextNode = fourthNode;
        fourthNode.nextNode = fifthNode;
        fifthNode.nextNode = sixthNode;
        sixthNode.nextNode = null;

        return firstNode;
    }
}
