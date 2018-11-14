package com.wx.datastructure.imp;

import com.wx.datastructure.base.LinkList;
import com.wx.datastructure.base.Node;

public class WxLinkList<T> implements LinkList<T> {
    private Node header; // 保存头结点
    private Node tail;   // 保存尾节点
    private int size;    // 保存已含有的节点数
    // 创建空链表
    public WxLinkList() {
        header = null;
        tail = null;
    }
    // 已指定数据元素创建链表，只有一个元素
    public WxLinkList(T element) {
        header = new Node(element, null);
        // 只有一个节点，header,tail都指向该节点
        tail = header;
        size++;
    }
    /*
       返回链表的大小，其实就是包含节点的数量
     */
    @Override
    public int size() {
        return this.size;
    }
    /*
    判断链表是否为空,
    */
    @Override
    public boolean isEmpty() {
        return this.size==0;
    }
    /*
      在指定位置插入元素
     */
    @Override
    public void add(int index, T element) {
         //先是要历遍到指定位置，然后创建新节点，前节点指向他，他指向后节点。
        if (index>=0&&index<size)
        {
            Node current=header;
            for(int i=0;i<=index&&current!=null;i++,current=current.next)
            {
                if(i==index-1)
                {
                    Node node=new Node(element,null);
                    Node next = current.next;
                    current.next=node;
                    node.next=next;
                    size++;
                }
            }
        }
    }
    /*
     链表新增一个元素。默认是尾部添加
     */
    @Override
    public void add(T element) {
         addLast(element);
    }
    /*
     链表头部添加元素
     */
    @Override
    public void addFirst(T element) {
        //在链表的头部添加元素就是要创建一个新节点，然后让新节点的指针域指向header
        //并以新节点作为新的header
        Node node=new Node(element,null);
        node.next=header;
        header=node;
        //若插入前是空表
        if(tail == null){
            tail = header;
        }
        size++;
    }
    /*
    链表尾部添加元素，这里一定要先判断是否为空链表
    */
    @Override
    public void addLast(T element) {
        //如果链表是空的链表，那么头指针还是null，所以处理一下头指针
        if(header==null)
        {
            header=new Node(element,null);
            tail=header; //这样处理过后，头指针和尾指针指向同一个节点，此时链表有一个节点
        }
        else {
            //新建一个节点,原来尾指针的指针域指向他，他变成尾指针
            Node node=new Node(element,null);
            tail.next=node;
            tail=node;
        }
        //链表的长度++
        size++;
    }
    /*
      指定删除一个元素
     */
    @Override
    public void remove(T elementm) {
        Node node=new Node(elementm,null);
        //历遍，判断是否相等
        Node current=header;
        Node prenode=null;  //要删除节点的上一个
        for (int i=0;i<size&&current!=null;i++,prenode=current,current=current.next)
        {
            if (node.getNodevalue().equals(current.getNodevalue()))
            {
                //如果删除的时头节点，prenode会为null;所以在这里需要判断,队列在这里透视需要弹出top的元素
                //当队列中只有一个元素的时候current.next;会为null
                if(i==0&&size>1)
                {
                    //当前节点的下一个节点为头节点
                    Node next = current.next;
                    header=next;
                    size--;
                }
                else if (i==0&&size==1)
                {
                    clear();
                }
                else {
                    Node nextnode=current.next;  //要删除节点的下一个节点
                    prenode.next=nextnode;       //当前节点的指针域指向下一个节点就删除了当前的节点
                    size--;
                }
            }
        }
    }
    /*
     清空线性表
     */
    @Override
    public void clear() {
      this.header=null;
      this.tail=null;
      this.size=0;
    }
    /*
       获得索引处的节点
     */
    private Node getNode(int index) {
        if(index<0||index>size)
        {
            throw new IndexOutOfBoundsException("index"+index);
        }
        //历遍链表,从头节点开始 header是头节点的引用
        Node current=header;
        for(int i=0;i<size&&current!=null;i++,current=current.next)
        {
            if (i==index)
            {
                return current;
            }
        }
       return  null;
    }
    /*
      通过返回的节点来获得他的值
     */
    @Override
    public Object get(int index) {
        Node node = getNode(index);
        return node.getNodevalue();
    }
}
