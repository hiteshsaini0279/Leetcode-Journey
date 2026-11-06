/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list= new ArrayList<>();
        while(head!=null){
         if(!list.contains(head.val)){
               list.add(head.val);
         }
            head=head.next;
        }
        if(list.size() == 0) {
    return null;
}
        ListNode h= new ListNode(list.get(0));
        ListNode temp=h;

        for(int i=1; i<list.size(); i++){
             ListNode newNode= new ListNode(list.get(i));
             temp.next=newNode;
             temp=temp.next;
        }
        return h;
    }
}