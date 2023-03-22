package practica2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author JD
 */
public class MateriaPrima extends Thread{
    javax.swing.JPanel panelSectores;
    javax.swing.JLabel labelI;
    Labels labelA;
    JLabel labelP = new JLabel();
    JLabel labelE = new JLabel();
    JLabel labelS = new JLabel();
    
    Bolita bolita;
    /*Labels labelI;
    Labels labelP;
    Labels labelE;
    Labels labelS;*/
    Menu menu = new Menu();
    
    static int contadorI = 0;
    static int contadorP = 0;
    static int contadorE = 0;
    static int contadorS = 0;
    
    public MateriaPrima(javax.swing.JPanel panel, javax.swing.JLabel labelI) {
        this.panelSectores = panel;
        this.labelI = labelI;
    }
    
    @Override
    public void run() {
        //labelA = new Labels(panelSectores);
        bolita = new Bolita(panelSectores);
        //panelSectores.add(labelI);
        
        /*labelP = new Labels(panelSectores);
        labelE = new Labels(panelSectores);
        labelS = new Labels(panelSectores);*/
        bolita.CambiarColor(Color.white);
        /*bolita.PosicionX(816);
        bolita.PosicionY(655);*/

        Global.contadorBolitasS = Global.contadorBolitasS+1;
        /*while(Global.contadorBolitas <= 10) {
            
            try {
                sleep(1000);
                bolita = new Bolita(panelSectores);
                Global.contadorBolitas = Global.contadorBolitas+1;
            } catch (InterruptedException ex) {
                Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        
        /*try {
            sleep(500);
            bolita = new Bolita(panelSectores);
        } catch (InterruptedException ex) {
            Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
        bolita.CambiarColor(Color.white);*/
        
            for(int i = 0; i <=97; i++ ) {
                try {
                    sleep(10);
                    bolita.PosicionY(655-i);
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
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 201) {
                System.out.println("Estoy dentro produccion");
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
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionX() == 300) {
                System.out.println("Estoy dentro empaquetado");
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
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 387) {
                System.out.println("Estoy dentro salida");
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
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(bolita.getPosicionY() == 653) {
                System.out.println("Estoy dentro final "+Global.contadorBolitasS);
                Global.contadorBolitasE = Global.contadorBolitasE+1;
                System.out.println("Final "+Global.contadorBolitasE);
                /*try {
                    //sleep(Integer.parseInt(menu.arrayS.get(3).getTiempo())*1000);
                    //bolita.PosicionX(136);
                    //bolita.PosicionY(558);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(MateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                //Global.contadorBolitas = Global.contadorBolitas+1;
            }

            /*try{

                sleep(500);
                 
            }catch (Exception e) {
                
            }*/
                
        

        //}
    }
    
}
