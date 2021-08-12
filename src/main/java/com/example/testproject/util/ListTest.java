package com.example.testproject.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: niuxiaowen
 * @Description:反转链表
 * @Date: 2021/8/9 15:08
 * @Version: 1.0
 */
class ListTest {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        if (list.size()>0){
            Collections.reverse(list);
            ListNode fristNode = new ListNode(list.get(0));
            ListNode nextNode;         //申明新节点
            nextNode = fristNode;      //新节点指向首节点
            for (int i=1;i<list.size();i++){
                ListNode node = new ListNode(list.get(i));
                nextNode.next = node;
                nextNode = nextNode.next;
            }
            nextNode = fristNode;
            //打印结果
            while (fristNode!=null){
                System.out.println("result节点:"+fristNode.val);
                fristNode=fristNode.next;
            }
            return fristNode;
        }
       return null;
    }

    public static void main(String[] args) {
        ListNode fn = new ListNode();     //创建首节点
        ListNode nn;                      //声明新节点
        nn=fn;                      //新节点指向首节点
        //创建链表
        //创建链表
        for(int i=1;i<10;i++){
            ListNode node = new ListNode(i);  //生成新的节点
            nn.next=node;               //把心节点连起来
            nn=nn.next;           //当前节点往后移动
        } //当for循环完成之后 nextNode指向最后一个节点，

        nn=fn;                     //重新赋值让它指向首节点

        ListTest listTest = new ListTest();
        //listTest.reverseList(fn);

        listTest.reverseListIterative(fn);
    }

    public static ListNode reverseListIterative(ListNode head) {
        ListNode prev = null; //前指针节点
        ListNode curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            ListNode nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
    }
}
