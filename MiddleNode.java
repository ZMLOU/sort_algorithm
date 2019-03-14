package wwww;

public class MiddleNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
//     second code   快慢指针

    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;    // slow 每次走一步
            fast=fast.next.next;    // fast 每次走两步
            // 当 fast.next == null 或者 fast == null时，slow刚好走到中点，跳出
        }
        return slow;
//     first code
//        int count=1;
//        int tem=0;
//        ListNode cur=head;
//        while(head.next!=null){
//            count++;
//        }
//        if(count%2!=0){
//            tem=(count+1)/2;
//        }else{
//            tem=count/2;
//        }
//        for(int i=0;i<tem;i++){
//            cur=cur.next;
//        }
//        return cur;
    }
}
