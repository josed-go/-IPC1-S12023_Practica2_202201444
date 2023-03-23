package practica2;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JD
 */
public class MateriaPrima extends Thread{
    javax.swing.JPanel panelSectores;
    javax.swing.JLabel labelI;
    javax.swing.JLabel labelP;
    javax.swing.JLabel labelE;
    javax.swing.JLabel labelS;
    javax.swing.JLabel labelInicio;
    javax.swing.JLabel labelFinal;
    javax.swing.JLayeredPane panelS;
        
    Bolita bolita;
    LabelSector lbl1;
    LabelSector lbl2;
    LabelSector lbl3;
    LabelSector lbl4;
    Menu menu = new Menu();
    
    static int contadorI = 0;
    static int contadorP = 0;
    static int contadorE = 0;
    static int contadorS = 0;
    static int contadorInicio = 30;
    static int contadorFinal = 0;
    
    public MateriaPrima(javax.swing.JPanel panel, javax.swing.JLabel labelI, javax.swing.JLabel labelP, javax.swing.JLabel labelE, javax.swing.JLabel labelS, javax.swing.JLabel labelInicio, javax.swing.JLabel labelFinal, javax.swing.JLayeredPane panelS) {
        this.panelSectores = panel;
        this.labelI = labelI;
        this.labelP = labelP;
        this.labelE = labelE;
        this.labelS = labelS;
        this.labelInicio = labelInicio;
        this.labelFinal = labelFinal;
        this.panelS = panelS;
    }
    
    @Override
    public void run() {
        bolita = new Bolita(panelSectores);

        bolita.CambiarColor(Color.white);

        Global.contadorBolitasS = Global.contadorBolitasS+1;
                
            for(int i = 0; i <=97; i++ ) {
                try {
                    sleep(10);
                    bolita.PosicionY(655-i);
                    if(i==50){
                        contadorInicio = contadorInicio-1;
                        labelInicio.setText("INICIO: "+contadorInicio);
                        
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            
            if(bolita.getPosicionY() == 558) {
                contadorI++;
                lbl1 = new LabelSector(panelS, 691,412, new Color(153,210,242));
                labelI.setText("INVENTARIO: "+contadorI);
                bolita.CambiarColor(new Color(153,210,242));
                try {
                    sleep(Integer.parseInt(menu.arrayS.get(0).getTiempo())*1000);
                    bolita.PosicionY(387);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            for(int i = 0; i <=186; i++ ) {
                try {
                    sleep(10);
                    bolita.PosicionY(387-i);
                    if(i == 50){
                        contadorI = contadorI-1;
                        labelI.setText("INVENTARIO: "+contadorI);
                        lbl1.Visibilidad(false);
                        
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 201) {
                contadorP++;
                lbl2 = new LabelSector(panelS, 691,55, new Color(227,250,227));
                labelP.setText("PRODUCCIÓN: "+contadorP);
                bolita.CambiarColor(new Color(227,250,227));
                try {
                    sleep(Integer.parseInt(menu.arrayS.get(1).getTiempo())*1000);
                    bolita.PosicionX(691);
                    bolita.PosicionY(116);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            for(int i = 0; i <=391; i++ ) {
                try {
                    sleep(10);
                    bolita.PosicionX(691-i);
                    if(i == 50){
                        contadorP = contadorP-1;
                        labelP.setText("PRODUCCIÓN: "+contadorP);
                        lbl2.setVisible(false);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionX() == 300) {
                contadorE++;
                lbl3 = new LabelSector(panelS, 50,55, new Color(244,217,255));
                labelE.setText("EMPAQUETADO: "+contadorE);
                bolita.CambiarColor(new Color(244,217,255));
                try {
                    sleep(Integer.parseInt(menu.arrayS.get(2).getTiempo())*1000);
                    bolita.PosicionX(175);
                    bolita.PosicionY(201);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            for(int i = 0; i <=186; i++ ) {
                try {
                    sleep(10);
                    bolita.PosicionY(201+i);
                    if(i == 50){
                        contadorE = contadorE-1;
                        labelE.setText("EMPAQUETADO: "+contadorE);
                        lbl3.Visibilidad(false);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 387) {
                contadorS++;
                lbl4 = new LabelSector(panelS, 50,412, new Color(255,217,217));
                labelS.setText("SALIDA: "+contadorS);
                bolita.CambiarColor(new Color(255,217,217));
                try {
                    sleep(Integer.parseInt(menu.arrayS.get(3).getTiempo())*1000);
                    bolita.PosicionY(558);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            for(int i = 0; i <=95; i++ ) {
                try {
                    sleep(10);
                    bolita.PosicionY(558+i);
                    if(i == 50){
                        contadorS = contadorS-1;
                        labelS.setText("SALIDA: "+contadorS);
                        lbl4.Visibilidad(false);
                        
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 653) {
                contadorFinal++;
                labelFinal.setText("FINAL: "+contadorFinal);
                Global.contadorBolitasE = Global.contadorBolitasE+1;
                if(contadorFinal == 30) {
                    contadorInicio = 30;
                    contadorFinal = 0;
                }
                
                
            }

    }
    
}
