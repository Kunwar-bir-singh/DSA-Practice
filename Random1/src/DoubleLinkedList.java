public class DoubleLinkedList {
    int size;
    private Node head;
    DoubleLinkedList(){
        this.size = 0;
    }

    public void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void DisplayReverse(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            last = temp;
            temp = temp.next;
        }
        while (last.prev != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        newNode.prev = null;
        size++;
    }

    public void inserLast(int value){
        if(size <=0){
            insertFirst(value);
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < size-1 ; i++){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = null;
        newNode.prev = temp;
        temp.next = newNode;


    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }
        Node(int value,Node next , Node prev){
            this.value =  value;
            this.next =  next;
            this.prev =  prev;
        }
    }

}
