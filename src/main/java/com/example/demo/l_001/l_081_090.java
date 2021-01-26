package com.example.demo.l_001;

import com.example.demo.data_structure.ListNode;

/**
 * @author sunrui
 * @description
 * @date 2021/1/24
 */
public class l_081_090 {
    //82. 删除排序链表中的重复元素 II
    //给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                ListNode temp = cur.next;
                while (temp != null && temp.next != null && temp.val == temp.next.val ) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            }
            else
                cur = cur.next;
        }
        return dummy.next;
    }
}
