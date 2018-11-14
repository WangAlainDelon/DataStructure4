package com.wx.datastructure.test;

import com.wx.datastructure.base.WxQueue;
import com.wx.datastructure.imp.WxQueueImp;

import java.util.Scanner;

public class TestWxQueue {
    /*
    测试WxQueue
     */
    public static void main (String[] args)
    {
        WxQueue wxQueue=new WxQueueImp();
        Scanner input =new Scanner(System.in);
        System.out.print("输入压入队列的元素，输入quit表示离开：");
        String element=input.next();
        while (!element.equals("quit"))
        {
            wxQueue.push(element);
            element=input.next();
        }
        while (!wxQueue.isEmpty())
        {
            System.out.print("    ");
            System.out.print(wxQueue.pop());
        }
    }
}
