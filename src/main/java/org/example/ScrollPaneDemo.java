package org.example;

import java.awt.*;

public class ScrollPaneDemo {

    public static void main(String[] args) {
        Frame frame = new Frame();


        ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

        scrollPane.add(new TextField("this is a scrollPane"));
        scrollPane.add(new TextArea("this is a TextArea"));
        scrollPane.add(new Button("this is a button"));

        frame.add(scrollPane);
        frame.setBounds(300, 300,500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
