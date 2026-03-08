public class q42 {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        q42 solver = new q42();

        q42.ListNode l1 = solver.new ListNode(1, solver.new ListNode(2, solver.new ListNode(4)));
        q42.ListNode l2 = solver.new ListNode(1, solver.new ListNode(3, solver.new ListNode(4)));

        q42.ListNode mergedHead = solver.mergeTwoLists(l1, l2);

        while (mergedHead != null) {
            System.out.print(mergedHead.val + " ");
            mergedHead = mergedHead.next;
        }
    }
}