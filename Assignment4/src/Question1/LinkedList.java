package Question1;

public class LinkedList<T> implements Runnable {
    public ListNode head;

    public LinkedList() {
        head = null;
    }

    @Override
    public void run() {
        synchronized (Main.list) {
            Thread currentThreat = Thread.currentThread();
            System.out.println("This is thread: " + currentThreat.getName());
            this.size(head);
            this.getLast(head);
            this.getFirst(head);
            this.printList();
            this.addAtPosition(1, 7);
            this.addAtPosition(2, 9);
            this.printList();
            this.removeAtPosition(5, 5);
            this.printList();
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addAtPosition(int index, int element) {
        ListNode newNode = new ListNode(element);
        ListNode pointer = head;
        for (int i = 0; i < index; i++) {
            if (pointer.next != null) {
                pointer = pointer.next;
            }
        }
        newNode.next = pointer.next;
        pointer.next = newNode;
    }

    public void removeAtPosition(int index, int element) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            head.val = head.next.val;
            head.next = head.next.next;
            return;
        }
        ListNode pointer = head;
        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.next;
        }
        if (pointer.next.next != null) {
            pointer.next = pointer.next.next;
        } else {
            pointer.next = null;
        }
    }

    public int getFirst(ListNode head) {
        System.out.println("first node is: " + head.val);
        return head.val;
    }

    public int getLast(ListNode head) {
        ListNode helper = head;
        while (helper.next != null) {
            helper = helper.next;
        }
        System.out.println("last node is:" + helper.val);
        return helper.val;
    }


    public int size(ListNode head) {
        if (head == null) {
            return 0;
        }
        int count = 1;
        ListNode helper = head;
        while (helper.next != null) {
            count++;
            helper = helper.next;
        }
        System.out.println("size is: " + count);
        return count;
    }

}

