package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/9/30 11:04.
 */
public class RemoveElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        if (head.val == val) head = head.next;
        ListNode parent = head;
        ListNode son = head.next;
        while (son != null){
            if (son.val == val){
                parent.next = son.next;
                son = son.next;
            }else{
                parent = parent.next;
                son = son.next;
            }
        }
        return head ;
    }

    public static void main(String[] args) {

    }
}
