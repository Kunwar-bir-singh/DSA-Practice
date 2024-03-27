public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size = 0;
    }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void InsertAtFirst(int value){
        Node node = new Node (value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void InsertAtLast(int value){
        if(tail ==null){
            InsertAtFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void InsertAtIndex(int value , int index){
          if(index ==0 ){
              InsertAtFirst(value);
          }
          if(index == size){
              InsertAtLast(value);
          }
          Node temp = head;
          for(int i = 1 ; i<index ; i++){
              temp = temp.next;
          }
          Node node = new Node(value , temp.next);
          temp.next = node;
          size++;
    }

    public int deleteFirst(){
        int value  = head.value;
        head = head.next ;

        if(head == null){
            tail = null;
        }
        size --;
        return value;
    }
    public int deleteLast(){
        Node temp = head;
        for (int i = 1; i < size-2; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        tail = temp;
        tail.next = null;
        size --;
        return value;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
