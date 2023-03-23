package practica2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author JD
 */
public class LabelSector extends JLabel {
    javax.swing.JLayeredPane panelS;
    boolean visibilidad;
    int x;
    int y;
    int posiXA;
    int posiYA;
    Random rX = new Random();
    Random rY = new Random();
    ArrayList<Integer> arrayX = new ArrayList<>();
    ArrayList<Integer> arrayY = new ArrayList<>();
    
    public void Visibilidad(boolean visi){
        this.setVisible(visi);
    }
    
    public LabelSector(javax.swing.JLayeredPane panelS, int x, int y, Color color) {
        this.panelS = panelS;
        this.x = x;
        this.y = y;
        
        try{
            this.setOpaque(true);
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setVerticalAlignment(JLabel.CENTER);
            setIcon(new ImageIcon("src/img/circulo.png"));
            this.setBackground(color);
            posiXA =  (int) (Math.random()*((this.x+275)+1-this.x))+this.x;
            posiYA = (int) (Math.random()*((this.y+171)+1-this.y))+this.y;
            arrayX.add(posiXA);
            arrayY.add(posiYA);
            if(ValidarPosicionX(posiXA)) {
                do {
                    posiXA =  (int) (Math.random()*((this.x+275)+1-this.x))+this.x;
                    //posiXA =  rX.nextInt((x+300)+1-x)+x;
                    arrayX.add(posiXA);
                }while(!ValidarPosicionX(posiXA));
            }
            if(ValidarPosicionY(posiXA)) {
                do {
                    //
                    posiYA = (int) (Math.random()*((this.y+171)+1-this.y))+this.y;
                    arrayY.add(posiYA);
                }while(!ValidarPosicionY(posiYA));
            }
            
            /*do {
                //posiXA =  (int) (Math.random()*((this.x+300)+1-this.x))+this.x;
                posiXA =  rX.nextInt((x+300)+1-x)+x;
                arrayX.add(posiXA);
            }while(ValidarPosicionX(posiXA) == true);
            do {
                //
                posiYA = rY.nextInt((y+171)+1-y)+y;
                arrayY.add(posiYA);
            }while(ValidarPosicionY(posiYA) == true);*/
            /*posiXA = rX.nextInt((x+300)+1-x)+x;
            posiXA = rY.nextInt((y+171)+1-y)+y;*/
            
            //this.setVisible(true);
            this.setBounds(posiXA, posiYA, 25, 25);
            this.panelS.add(this, JLayeredPane.DRAG_LAYER);
        }catch(Exception e){
            
        }
    }
    
    public boolean ValidarPosicionX(int x) {
        for(int i =0; i < arrayX.size(); i++) {
            if(arrayX.get(i) == x) {
                return true;
            }
        }
        return false;
    }
    
    public boolean ValidarPosicionY(int y) {
        for(int i =0; i < arrayY.size(); i++) {
            System.out.println("aqui1");
            if(arrayY.get(i) == y) {
                System.out.println("aqui");
                System.out.println(arrayY.get(i));
                return true;
            }
        }
        return false;
    }
    
}
