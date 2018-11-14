package com.wx.datastructure.base;

public class Node {
    /*
      定义一个节点类，包含数据域和指针域
     */
    private Object nodevalue; //数据域
    public Node next; //指针域
    public Node ()
    {

    }
    public Node(Object nodevalue,Node next)
    {
        this.nodevalue=nodevalue;
        this.next=next;
    }

    public Object getNodevalue() {
        return nodevalue;
    }

    public void setNodevalue(Object nodevalue) {
        this.nodevalue = nodevalue;
    }

}
