package com.example.demo.data_structure;

import com.example.demo.l_001.l_081_090;

/**
 * @author sunrui
 * @description
 * @date 2021/1/24
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int x) {
        val = x;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
