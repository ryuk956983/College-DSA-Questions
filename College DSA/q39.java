public class q39 {

    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val  = val;
            this.next=next;
        }
}
    public void main(String[] args) {

        ListNode head  = new ListNode(5);
        for(int i=4;i>=1;i--){
            ListNode l1 = new ListNode(i,head);
            head = l1;
        }

        System.out.println("Linked List before reverse");
        ListNode temp3 =head;
        while(temp3!=null){
            System.err.println(temp3.val);
            temp3 = temp3.next;
        }
        ListNode temp = head;
        ListNode curr = head;

        ListNode hp = null;

        while(curr!=null){
            curr = curr.next;
            temp.next = hp;
            hp=temp;
            temp=curr;
        }
         ListNode temp2 = hp;
         System.out.println("Linked List after reverse");
        while(temp2!=null){
                    System.err.println(temp2.val);
                    temp2 = temp2.next;
                }


        
       
        
    }
}
