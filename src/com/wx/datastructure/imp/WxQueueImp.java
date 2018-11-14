package com.wx.datastructure.imp;

import com.wx.datastructure.base.WxQueue;

import java.util.NoSuchElementException;

public class WxQueueImp implements WxQueue {
    /*
      实现队列的接口方法
     */
    private WxLinkList linkList=null;
    public WxQueueImp()
    {
        linkList=new WxLinkList();
    }

    /*
      判断队列是否为空
     */
    @Override
    public boolean isEmpty() {
        return linkList.isEmpty();
    }
    /*
      返回队列的大小
     */
    @Override
    public int size() {
        return linkList.size();
    }

    /*
      从队尾压入元素
     */
    @Override
    public void push(Object element) {
        linkList.addLast(element);
    }

    /*
        弹出队首元素
     */
    @Override
    public Object pop() {
        if (linkList.isEmpty())
        {
            throw new NoSuchElementException("队列为空");
        }
        Object o = linkList.get(0);
        linkList.remove(o);
        return o;
    }

    @Override
    public Object peek() {
        if (linkList.isEmpty())
        {
            throw new NoSuchElementException("队列为空");
        }
        return linkList.get(0);
    }
}
