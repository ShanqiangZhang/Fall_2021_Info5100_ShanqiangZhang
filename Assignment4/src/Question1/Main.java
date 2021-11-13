package Question1;

public class Main {
    public static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        list.head = head;
        head.next =node2;
        node2.next =node3;
        node3.next =node4;
        node4.next =node5;

        Thread currentThread = Thread.currentThread();
        System.out.println("This is thread: " + currentThread.getName());
        list.size(head);
        list.getLast(head);
        list.getFirst(head);

        list.printList();
        list.addAtPosition(2,2);
        list.printList();
        list.removeAtPosition(3,2);
        list.printList();
        System.out.println();


        Thread thread1 = new Thread(list);
        Thread thread2 = new Thread(list);
        Thread thread3 = new Thread(list);
        Thread thread4 = new Thread(list);
        Thread thread5 = new Thread(list);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
