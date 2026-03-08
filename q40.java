public class q40 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        q40 solver = new q40();
        
        q40.ListNode head = solver.new ListNode(1);
        q40.ListNode second = solver.new ListNode(2);
        q40.ListNode third = solver.new ListNode(3);
        q40.ListNode fourth = solver.new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; 

        boolean result = solver.hasCycle(head);
        System.out.println("Has Cycle: " + result);
    }
}