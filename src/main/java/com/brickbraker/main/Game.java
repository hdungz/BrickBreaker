package com.brickbraker.main;

public class Game implements Runnable {

    private GameWindow window;
    private GamePanel panel;
    private Thread gameThread;
    private final int FPS_LOCK = 60;

    public Game() {
        panel = new GamePanel();
        window = new GameWindow(panel);
        panel.requestFocus();
    }

    private void startGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double timePerFrame = 1000000000.0 / FPS_LOCK;
        long lastFrame = System.nanoTime();
        long now;
        while (true) {
            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame) {
                panel.repaint();
                lastFrame = now;
            }
        }
    }

}
