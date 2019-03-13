package wwww;

public class RemoveElements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        //头节点的值就是要删除的值
        while(head!=null && head.val==val){
            head=head.next;
        }
        //头节点为空
        if(head==null){
            return null;
        }
        ListNode retNode=head;
        while(head.next!=null){
            if(head.next.val==val){
                // 若用 head = head.next.next 例 ：1 2 6 6 5 val = 6；将会跳过第二个6；
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return retNode;
//        ListNode dummyNode=new ListNode(0);
//        dummyNode.next=head;
//        ListNode cur=dummyNode;
//        while(cur!=null){
//            if(cur.next!=null&&cur.next.val==val){
//                cur.next=cur.next.next;
//            }else{
//                cur=cur.next;
//            }
//        }
//       return dummyNode.next;
    }
}
