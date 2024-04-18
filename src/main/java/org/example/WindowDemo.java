package org.example;

import java.awt.*;

public class WindowDemo {

    public static void main(String[] args) {
        //1、创建一个窗口对象
        Frame frame = new Frame("Window Demo");
        //2、指定窗口位置和大小
        frame.setLocation(100,100);
        frame.setSize(500,100);

        //3、设置窗口可见
        frame.setVisible(true);
    }

}
