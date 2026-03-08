public class q41 {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
        ListNode (int val,ListNode next){
            this.val=val;
            this.next  = next;
        }
    }
    public void main(String[] args){

        ListNode head  =  new ListNode(10);
        for(int i=9;i>=1;i--){
            ListNode temp = new ListNode(i,head);
            head = temp;
        }

        System.out.println("Given List:");

        ListNode temp = head;
        while(temp!=null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        System.out.println("Middle of the List");

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null){
            fast=fast.next.next;
            slow= slow.next;
        }
        System.err.println(slow.val);

    }
}
