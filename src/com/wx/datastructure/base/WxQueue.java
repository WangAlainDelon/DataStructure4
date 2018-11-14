package com.wx.datastructure.base;

public interface WxQueue {
    /*
      链式队列的接口
     */
    public boolean isEmpty();//判断队列是否为空
    public int size();       //返回队列的大小
    public void push(Object element); //将元素由队尾压入队列
    public Object pop();     //弹出队首的元素
    public Object peek();    //查找队首的元素
}
