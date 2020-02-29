/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        ArrayList<String> list=new ArrayList<>();

        while(true){
            if(head==null){
                break;
            }
            list.add(Integer.toString(head.val));
            head = head.next;
        }

        for(int i=0; i<list.size()/2; i++){
            if(list.get(i).equals(list.get(list.size()-1-i))==false){
                return false;
            }
        }
        return true;
    }
}