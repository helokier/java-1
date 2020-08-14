package Flappybird;

/**
 * flappybird
 */
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.Action;
import javax.swing.JFrame;

public class flappybird implements ActionListener {

    public static flappybird flappybird;
    public final int width = 800, height = 800;
    public Renderer renderer;

    public flappybird() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);
        renderer = new Renderer();
        jframe.add(renderer);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(width, height);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }

    public void ancestorAdded(AncestorEvent event) {
         
    }

    public void repaint(Graphics g) {

    }

    public static void main(String[] args) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    
}