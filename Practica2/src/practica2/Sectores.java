package practica2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author JD
 */
public class Sectores extends JComponent{
    
    
    
    public Sectores() {
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        Rectangle2D.Double rI = new Rectangle2D.Double(691,387,300,221);
        g2d.setColor(new Color(153,210,242));
        g2d.fill(rI);
        g2d.setColor(Color.black);
        g2d.draw(rI);
        
        
        Rectangle2D.Double rS = new Rectangle2D.Double(50,387,300,221);
        g2d.setColor(new Color(255,217,217));
        g2d.fill(rS);
        g2d.setColor(Color.black);
        g2d.draw(rS);
        
        Rectangle2D.Double rE = new Rectangle2D.Double(50,30,300,221);
        g2d.setColor(new Color(244,217,255));
        g2d.fill(rE);
        g2d.setColor(Color.black);
        g2d.draw(rE);
        
        Rectangle2D.Double rP = new Rectangle2D.Double(691,30,300,221);
        g2d.setColor(new Color(227,250,227));
        g2d.fill(rP);
        g2d.setColor(Color.black);
        g2d.draw(rP);
        
        Line2D.Double line1 = new Line2D.Double(841,387,841,251);
        g2d.setColor(Color.black);
        g2d.draw(line1);
        
        Line2D.Double line2 = new Line2D.Double(200,387,200,251);
        g2d.setColor(Color.black);
        g2d.draw(line2);
        
        Line2D.Double line3 = new Line2D.Double(350,140.5,691,140.5);
        g2d.setColor(Color.black);
        g2d.draw(line3);
        
        Line2D.Double line4 = new Line2D.Double(841,657,841,608);
        g2d.setColor(Color.black);
        g2d.draw(line4);
        
        Line2D.Double line5 = new Line2D.Double(200,657,200,608);
        g2d.setColor(Color.black);
        g2d.draw(line5);
        
        Rectangle2D.Double rInicio = new Rectangle2D.Double(766,653,150,75);
        g2d.setColor(new Color(255,221,116));
        g2d.fill(rInicio);
        g2d.setColor(Color.black);
        g2d.draw(rInicio);
        
        Rectangle2D.Double rFinal = new Rectangle2D.Double(125,653,150,75);
        g2d.setColor(new Color(255,221,116));
        g2d.fill(rFinal);
        g2d.setColor(Color.black);
        g2d.draw(rFinal);
    }
    
}
