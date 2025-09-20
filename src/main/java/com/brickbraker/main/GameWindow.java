package com.brickbraker.main;

import javax.swing.*;

public class GameWindow extends javax.swing.JFrame {
    public GameWindow(GamePanel panel) {
        JFrame jframe = new javax.swing.JFrame();

        jframe.setSize(400, 400);//set size cho window
        jframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jframe.add(panel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
