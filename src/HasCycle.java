import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/17.
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        Set<ListNode> nodeSet = new HashSet<>();
        nodeSet.add(head);
        while (head.next != null){
            if (nodeSet.contains(head.next)){
                return true;
            }
            nodeSet.add(head.next);
            head = head.next;
        }
        return false;
    }
    public static void main(String[] args){
        HasCycle a = new HasCycle();
        ListNode[] temp = new ListNode[10];
        for(int i = 0; i<10;i++){
            temp[i] = new ListNode(i);
        }
        for(int j = 0; j<9;j++){
            temp[j].next = temp[j+1];
        }
        ListNode in = new ListNode(0);
        in.next = temp[0];
        System.out.print(a.hasCycle(in));
    }
}
