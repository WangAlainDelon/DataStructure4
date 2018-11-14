package com.wx.datastructure.base;
public interface  LinkList <T>{
    /*
      实现线性表的链式存储
     */
    public int size();//返回线性表长度的大小
    public boolean isEmpty();//判断线性表是否为空
    public void add(int index, T element);//指定位置插入元素in
    public void add(T element);//线性表的添加元素，默认尾部添加
    public void addFirst(T element); //在线性表的头部添加元素
    public void addLast(T element);  //在线性表的尾部添加元素
    public void remove(T elementm);//移除指定位置的元素
    public void clear();//清空链表
    public Object get(int index); //根据链表下标返回元素
}
