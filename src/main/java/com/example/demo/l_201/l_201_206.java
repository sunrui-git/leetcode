package com.example.demo.l_201;

import com.example.demo.data_structure.ListNode;

/**
 * @author sunrui
 * @description
 * @date 2021/2/2
 */
public class l_201_206 {

    // 206 反转一个单链表。
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
