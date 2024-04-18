package org.example;

import javax.swing.*;
import java.awt.*;

public class LayoutManageDemo {

    public static void main(String[] args) {
        Frame frame = new Frame();
        LayoutManager layoutManager = new FlowLayout(FlowLayout.LEFT,20,20);
        frame.setLayout(layoutManager);

        for (int i = 0; i < 100; i++) {
            frame.add(new JButton("button" + i));
        }
        frame.setBounds(40,40,1000,1000);
        frame.setVisible(true);

    }

}
