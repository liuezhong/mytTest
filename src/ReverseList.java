/**
 * Created by Administrator on 2018/1/19.
 */
public class ReverseList {
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode result = new ListNode(head.val);
//        ListNode temp = head.next;
//        while (temp != null){
//            ListNode listNode = new ListNode(temp.val);
//            listNode.next = result;
//            result = listNode;
//            temp = temp.next;
//        }
//        return result;
//    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public static void main(String[] args){
        ListNode[] temp = new ListNode[10];
        for(int i = 0; i<10;i++){
            temp[i] = new ListNode(i);
        }
        for(int j = 0; j<9;j++){
            temp[j].next = temp[j+1];
        }
        ListNode in = new ListNode(0);
        in.next = temp[0];
        ReverseList a = new ReverseList();
        System.out.print(a.reverseList(in).toString());
    }
}
