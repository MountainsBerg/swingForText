package com.mountain.simpleText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad extends JFrame implements ActionListener {
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;

    public SimpleNotepad() {
        setTitle("Simple Notepad");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // 最大化窗口
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        menuBar = new JMenuBar();
        menu = new JMenu("File");

        newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        menu.add(newMenuItem);

        openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        menu.add(openMenuItem);

        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        menu.add(saveMenuItem);

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(this);
        menu.add(exitMenuItem);

        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newMenuItem) {
            textArea.setText("");
        } else if (e.getSource() == openMenuItem) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line = "";
                    String content = "";
                    while ((line = reader.readLine()) != null) {
                        content += line + "\n";
                    }
                    textArea.setText(content);
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == saveMenuItem) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleNotepad notepad = new SimpleNotepad();
            notepad.setVisible(true);
        });
    }


}