/**
 * Created by Administrator on 2018/1/15.
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
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
        DeleteDuplicates a = new DeleteDuplicates();
        System.out.print(a.deleteDuplicates(in).toString());
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
