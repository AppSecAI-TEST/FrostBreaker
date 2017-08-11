package frostbreaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    
    private int totalBrick = 21;
    
    private Timer timer;
    private int delay = 8;
    
    private int playerX = 310;
    
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Gameplay() {
       addKeyListener(this);
       setFocusable(true);
       setFocusTraversalKeysEnabled(false);
       timer = new Timer(delay, this);
       timer.start();
    }
    
    public void paint(Graphics g){
        //background
       g.setColor(Color.black);
       g.fillRect(1,1,692,592);
       
       //borders
       g.setColor(Color.yellow);
       g.fillRect(0,0,3,592);
       g.fillRect(0,0,692,3);
       g.fillRect(0,0,3,592);
       
       //paddle
       g.setColor(Color.green);
       g.fillRect(playerX, 550, 100, 8);
       
       //ball
       g.setColor(Color.yellow);
       g.fillRect(ballposX, ballposY, 20, 20);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >=600) {
                player = 600;
            } else {
                moveRight();
            }
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(playerX < 10) {
                player = 10;
            } else {
                moveLeft();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
}