package com.wx.datastructure.test;

import com.wx.datastructure.imp.WxLinkList;

public class TestLinkList {
    public static void main(String []args)
    {
       WxLinkList<String> list=new WxLinkList<String>();
       list.add("1");
       list.add("2");
       list.addFirst("3");
       list.add(1,"4");
        System.out.print("链表的长度"+list.size()+"  ");
        System.out.print(list.get(0));
        System.out.print(list.get(1));
        System.out.print(list.get(2));
        System.out.print(list.get(3));  //3412
        list.remove("3");
        System.out.print("    ");
        System.out.print(list.get(0));
        System.out.print(list.get(1));
        System.out.print(list.get(2));

       /* Node node1=new Node("1",null);
        Node node2=new Node("2",null);
        Node node3=new Node("3",null);
        Node header=null;

        node1.next=node2;
        node2.next=node3;
        header=node1;
        Object nodevalue = header.getNodevalue();
        Node node4=node1.next;
        Node node5=node2.next;
        Node node6=node3.next;*/


    }
}
