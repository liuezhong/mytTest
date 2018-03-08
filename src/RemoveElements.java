/**
 * Created by Administrator on 2018/1/18.
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode temp = head;
        while (temp.next != null){
            if (temp.next.val == val) temp.next = temp.next.next;
            temp = temp.next;
        }
        if(head.val == val) return head.next;
        return head;
    }
    public static void main(String[] args){
        RemoveElements a = new RemoveElements();
        ListNode in = new ListNode(3);
        in.next = new ListNode(4);
        System.out.print(a.removeElements(in,4));
    }
}
