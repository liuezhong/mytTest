/**
 * Created by Administrator on 2018/1/23.
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        if(node.next == null){
            node = null;
        }else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
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
        DeleteNode a = new DeleteNode();
        a.deleteNode(in);
        System.out.print(new ListNode(0).toString());
    }
}
