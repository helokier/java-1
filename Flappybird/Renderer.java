package Flappybird;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 * Renderer
 */
public class Renderer  extends JPanel{
public static final long seriolversionUID =1L;

    protected void paintComponent(Graphics g)
     {
        super.paintComponent(g);
        flappybird.flappybird.repaint(g);
    }
}
    
