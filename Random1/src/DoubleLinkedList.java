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
        size++;
    }

    public void insertIndex(int value , int index){
        if(size <=1 || index == 0){
            insertFirst(value);
            return;
        }
        if(size == index){
            inserLast(value);
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;

        }
        System.out.println(temp.value);
        Node before = temp.prev;
        Node newNode = new Node(value);

        before.next = newNode;
        newNode.next = temp;
        temp.prev = newNode;
        newNode.prev = before;
        size++;
    }

    public void deleteFirst(){
        if(size <=0){
            System.out.println("Linked List Already Empty");
            return;
        }
        System.out.println("Value Deleted :" + head.value);
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast(){
        if(size <=0){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i =0 ; i < size-2 ; i++){
            temp = temp.next;
        }
        System.out.println("Value Deleted :" + temp.next.value);
        temp.next.prev = null;
        temp.next = null;
        size--;
    }

    public void deleteIndex(int index){
        Node before = head;
        for(int i = 0 ; i < index-1 ; i++){

        }
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
