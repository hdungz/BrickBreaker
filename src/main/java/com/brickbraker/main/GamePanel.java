package com.brickbraker.main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class GamePanel extends JPanel {

    private int XDelta = 0, YDelta = 0;
    private MouseInputs mouseInputs;

    public GamePanel() {
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }


    public void paint(Graphics g) {
        super.paint(g); //gọi super class

    }
}
