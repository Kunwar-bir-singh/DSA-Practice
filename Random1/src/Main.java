
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(40);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertIndex(50, 1);
        list.Display();
        list.deleteIndex(0);
        list.Display();


    }
}
