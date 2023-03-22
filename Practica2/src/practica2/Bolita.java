package practica2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 *
 * @author JD
 */
public class Bolita extends JComponent{
    Color color;
    int x =816;
    int y =655;
    javax.swing.JPanel panel;
    int contador = 0;
    
    public Bolita(javax.swing.JPanel panel) {
        this.panel = panel;
        try {
            panel.add(this);
        }catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
    
    public void PosicionX(int x) {
        this.x = x;
        repaint();
    }
    
    public int getPosicionX () {
        return this.x;
    }
    
    public void PosicionY(int y) {
        this.y = y;
        repaint();
    }
    
    public int getPosicionY () {
        return this.y;
    }
    
    public void CambiarColor(Color color) {
        this.color = color;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double c = new Ellipse2D.Double(x,y,50,50);
        g2d.setColor(color);
        g2d.fill(c);
        super.paintComponent(g);
        g2d.setColor(Color.black);
        g2d.draw(c);
        //g2d.fillOval(x, y, 50, 50);
        //g.dispose();*/
        //g2d.dispose();
        //panel.repaint();
        this.repaint();
        
    }

    /*@Override
    public void run() {
        //panel.add(this);
        while(contador != 30) {
            try{
                Thread.sleep(100);
                this.PosicionX(816);
                this.PosicionY(635);
                for(int i =635; i<=735; i--) {
                    Thread.sleep(20);
                    this.PosicionY(i);
                }
                System.out.println("bolita"+ contador);
                contador++;
            }catch (Exception e) {
                
            }
        }
    }*/
}
