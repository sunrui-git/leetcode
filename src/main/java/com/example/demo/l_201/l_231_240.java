package com.example.demo.l_201;

import com.example.demo.data_structure.ListNode;

/**
 * @author sunrui
 * @description
 * @date 2021/1/24
 */
public class l_231_240 {

    // 237. 删除链表中的节点 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。
    // 传入函数的唯一参数为 要被删除的节点 。
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
