import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/17.
 */
public class GetIntersectionNode {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null){
//            return null;
//        }
//        Set<ListNode> nodeSet = new HashSet<>();
//
//        while (headA != null){
//            nodeSet.add(headA);
//            headA = headA.next;
//        }
//        while (headB != null){
//            if(nodeSet.contains(headB)){
//                return headB;
//            }
//        }
//        return null;
//    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if( null==headA || null==headB )
            return null;

        ListNode curA = headA, curB = headB;
        while( curA!=curB){
            curA = curA==null?headB:curA.next;
            curB = curB==null?headA:curB.next;
        }
        return curA;
    }
    public static void main(String[] args){
        ListNode[] temp = new ListNode[10];
        for(int i = 0; i<10;i++){
            temp[i] = new ListNode(i);
        }
        for(int j = 0; j<9;j++){
            temp[j].next = temp[j+1];
        }
        ListNode in = new ListNode(20);
        in.next = new ListNode(24);
        ListNode out = new ListNode(23);
//        in.next = temp[0];
        GetIntersectionNode a = new GetIntersectionNode();
        System.out.print(a.getIntersectionNode(in,temp[0]));
    }
}
