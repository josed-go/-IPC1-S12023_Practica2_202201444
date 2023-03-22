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
        
    Bolita bolita;
    Menu menu = new Menu();
    
    static int contadorI = 0;
    static int contadorP = 0;
    static int contadorE = 0;
    static int contadorS = 0;
    static int contadorInicio = 30;
    static int contadorFinal = 0;
    
    public MateriaPrima(javax.swing.JPanel panel, javax.swing.JLabel labelI, javax.swing.JLabel labelP, javax.swing.JLabel labelE, javax.swing.JLabel labelS, javax.swing.JLabel labelInicio, javax.swing.JLabel labelFinal) {
        this.panelSectores = panel;
        this.labelI = labelI;
        this.labelP = labelP;
        this.labelE = labelE;
        this.labelS = labelS;
        this.labelInicio = labelInicio;
        this.labelFinal = labelFinal;
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
                System.out.println("Estoy dentro inventario");
                
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
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 201) {
                contadorP++;
                System.out.println("Estoy dentro produccion");
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
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionX() == 300) {
                contadorE++;
                System.out.println("Estoy dentro empaquetado");
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
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 387) {
                contadorS++;
                System.out.println("Estoy dentro salida");
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
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 653) {
                System.out.println("Estoy dentro final "+Global.contadorBolitasS);
                contadorFinal++;
                labelFinal.setText("FINAL: "+contadorFinal);
                Global.contadorBolitasE = Global.contadorBolitasE+1;
                System.out.println("Final "+Global.contadorBolitasE);

            }

    }
    
}
