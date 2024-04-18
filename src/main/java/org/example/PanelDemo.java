package org.example;

import java.awt.*;

public class PanelDemo {

    public static void main(String[] args) {
        //创建一个window对象 除了window可以独立创建，其他的容器都只能依赖window存在
        //1、创建一个window度歘啊ing
        Frame frame = new Frame();
        //2、创建一个panel对象
        Panel panel = new Panel();
//        3、创建一个文本框和一个按钮，并放到文本中
        panel.add(new TextField("this is a panel"));
        panel.add(new Button("button"));
        frame.add(panel);
        frame.setBounds(100,100,300,300);
        frame.setVisible(true);
    }

}
