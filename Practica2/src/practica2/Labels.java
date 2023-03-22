package practica2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author JD
 */
public class Labels extends JComponent{
    javax.swing.JPanel panel;
    String texto = "";
    int x;
    int y;
    
    public Labels(javax.swing.JPanel panel) {
        this.panel = panel;
        try {
            panel.add(this);
        }catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
    }
    
    public void Posicion(int x, int y) {
        this.x = x;
        this.y = y;
        this.repaint();
    }
    
    public void CambiarTexto(String text) {
        this.texto = text;
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("arial", Font.BOLD,25));
        g2d.drawString(texto, x, y);
        super.paintComponent(g);
        
        this.repaint();
        
    }
    
}
