public class Practice {

    private Node head;
    private Node tail;

    private int size ;
    Practice(){
        this.size = 0;
    }

    void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    void insertLast(int value){
        if(tail == null){
            insertFirst(value);
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size ++;

    }

    void insertIndex(int value , int index){
        if(index == 0){
            insertFirst(value);
        }
        if(index == size-1){
            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value , temp.next);
        temp.next = newNode;
        size++;
    }

    void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    void deleteLast(){
        if(size <=0){
            deleteFirst();
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        Node secondLast = temp;
        secondLast.next = null;
        tail = secondLast;
        size--;
    }

    void deleleIndex(int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node newNode= new Node(temp.value , temp);
        newNode.next = temp.next.next;
        size--;
    }
    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
        Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
