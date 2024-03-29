package practica2;

import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author JD
 */
public class Simulacion extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Simulacion
     */
    
    static int contadorBolita = 0;
    Cronometro crono = new Cronometro();
    JLabel labelI = new JLabel();
    JLabel labelP = new JLabel();
    JLabel labelE = new JLabel();
    JLabel labelS = new JLabel();
    JLabel labelInicio = new JLabel();
    JLabel labelFinal = new JLabel();
    Font labelFont = new Font("Dialog", Font.BOLD, 18);
    public Simulacion() {
        initComponents();
                
        Botones(false);
        
        labelInicio.setBounds(803,673, 150,25);
        labelInicio.setFont(labelFont);
        labelInicio.setText("INICIO: 30");
        panelS.add(labelInicio, JLayeredPane.DRAG_LAYER);
                
        labelFinal.setBounds(162,673, 150,25);
        labelFinal.setFont(labelFont);
        labelFinal.setText("FINAL: 0");
        panelS.add(labelFinal, JLayeredPane.DRAG_LAYER);
        
        labelI.setBounds(693,387,300,25);
        labelI.setFont(labelFont);
        labelI.setText("INVENTARIO: 0");
        panelS.add(labelI, JLayeredPane.DRAG_LAYER);
        
        labelP.setBounds(693,30, 300, 25);
        labelP.setFont(labelFont);
        labelP.setText("PRODUCCIÓN: 0");
        panelS.add(labelP, JLayeredPane.DRAG_LAYER);
        
        labelE.setBounds(52,30, 300, 25);
        labelE.setFont(labelFont);
        labelE.setText("EMPAQUETADO: 0");
        panelS.add(labelE, JLayeredPane.DRAG_LAYER);
        
        labelS.setBounds(52,387, 300, 25);
        labelS.setFont(labelFont);
        labelS.setText("SALIDA: 0");
        panelS.add(labelS, JLayeredPane.DRAG_LAYER);

        crono.LabelTiempo(lblTiempo);
        crono.start();
        Thread hiloP = new Thread(this);
        hiloP.start();
        
        Sectores sec = new Sectores();
        panelSectores.add(sec);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        panelS = new javax.swing.JLayeredPane();
        panelSectores = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel2.setBackground(new java.awt.Color(69, 154, 150));

        btnRegresar.setBackground(new java.awt.Color(70, 96, 103));
        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setFocusPainted(false);
        btnRegresar.setRequestFocusEnabled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(70, 96, 103));
        btnReporte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("TIEMPO TRANSCURRIDO:");

        lblTiempo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setText("00:00");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnRegresar)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lbl))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(lblTiempo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(btnReporte)
                .addGap(41, 41, 41))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnReporte))
                .addGap(33, 33, 33))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTiempo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelS.setOpaque(true);

        panelSectores.setLayout(new javax.swing.OverlayLayout(panelSectores));

        panelS.setLayer(panelSectores, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelSLayout = new javax.swing.GroupLayout(panelS);
        panelS.setLayout(panelSLayout);
        panelSLayout.setHorizontalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSectores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSLayout.setVerticalGroup(
            panelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSLayout.createSequentialGroup()
                .addComponent(panelSectores, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelS)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        CrearReporte();
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
        menu.arrayS.clear();
        Global.contadorBolitasS = 0;
        Global.contadorBolitasE = 0;
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    private void CrearReporte() {
        Menu menu = new Menu();
        StringBuilder codigoHTML = new StringBuilder();
        
        int costoI = Integer.parseInt(menu.arrayS.get(0).getTiempo())*Integer.parseInt(menu.arrayS.get(0).getCosto())*30;
        int costoP = Integer.parseInt(menu.arrayS.get(1).getTiempo())*Integer.parseInt(menu.arrayS.get(1).getCosto())*30;
        int costoE = Integer.parseInt(menu.arrayS.get(2).getTiempo())*Integer.parseInt(menu.arrayS.get(2).getCosto())*30;
        int costoS = Integer.parseInt(menu.arrayS.get(3).getTiempo())*Integer.parseInt(menu.arrayS.get(3).getCosto())*30;
        int total = costoI + costoP + costoE + costoS;
        
        codigoHTML.append("<!DOCTYPE html>");
        codigoHTML.append("<html>");
        codigoHTML.append("<head>");
        codigoHTML.append("<meta charset=\"UTF-8\">");
        codigoHTML.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        codigoHTML.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        codigoHTML.append("<title>Reporte de sectores</title>");
        codigoHTML.append("</head>");
        codigoHTML.append("<body style=\"margin-left: 250px; margin-top: 200px; margin-right: 250px; border: solid #484450 ; border-radius: 10px;\">");
        codigoHTML.append("<h1 style=\"text-align:center; font-size:75px;\">Reporte de sectores</h1>");
        codigoHTML.append("<hr style=\"margin: 35px;\">");
        codigoHTML.append("<div style=\"margin: 35px; text-align: center; align-items: center; \">");
        codigoHTML.append("<table style=\"margin: 0 auto; width: 50%;\" border=\"1\">");
        codigoHTML.append("<tr style=\"background-color: #34baab;\">");
        codigoHTML.append("<th scope=\"row\">SECTOR</th>");
        codigoHTML.append("<th >COSTO</th>");
        codigoHTML.append("</tr>");
        codigoHTML.append("<tr>");
        codigoHTML.append("<th style=\"background-color: #c4c8c5;\">INVENTARIO</th>");
        codigoHTML.append("<td>Q "+costoI+"</td>");
        codigoHTML.append("</tr>");
        codigoHTML.append("<tr>");
        codigoHTML.append("<th style=\"background-color: #c4c8c5;\">PRODUCCIÓN</th>");
        codigoHTML.append("<td>Q "+costoP+"</td>");
        codigoHTML.append("</tr>");
        codigoHTML.append("<tr>");
        codigoHTML.append("<th style=\"background-color: #c4c8c5;\">EMPAQUETADO</th>");
        codigoHTML.append("<td>Q "+costoE+"</td>");
        codigoHTML.append("</tr>");
        codigoHTML.append("<tr>");
        codigoHTML.append("<th style=\"background-color: #c4c8c5;\">SALIDA</th>");
        codigoHTML.append("<td>Q "+costoS+"</td>");
        codigoHTML.append("</tr>");
        codigoHTML.append("</table>");
        codigoHTML.append("</div>");
        codigoHTML.append("<div style=\"text-align: center; font-size: 20px;\">");
        codigoHTML.append("<h2>Total: Q "+total+"</h2>");
        codigoHTML.append("<h2>José David Gongora Olmedo</h2>");
        codigoHTML.append("<h2>202201444</h2>");
        codigoHTML.append("</div>");
        codigoHTML.append("</body>");
        codigoHTML.append("</html>");
        
        try {
            File file = new File("src/reportes/Reporte"+".html");
            FileWriter html = new FileWriter(file);
            html.write(codigoHTML.toString());
            html.close();
            
            Desktop.getDesktop().open(file);
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }

    private void Botones(boolean flag) {
        btnRegresar.setEnabled(flag);
        btnReporte.setEnabled(flag);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel panel2;
    private javax.swing.JLayeredPane panelS;
    private javax.swing.JPanel panelSectores;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        
        while(Global.contadorBolitasS < 30) {
            MateriaPrima mp1 = new MateriaPrima(panelSectores, labelI, labelP, labelE, labelS, labelInicio, labelFinal, panelS);
                mp1.start();
                
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        while(Global.contadorBolitasE < 30) {
            Botones(false);
            System.out.println("");
        }
        if(Global.contadorBolitasE == 30) {
            crono.stop();
            JOptionPane.showMessageDialog(this, "Simulación finalizada.");
            System.out.println("");
            Botones(true);
        } 
        
    }
}
