package practica2;

/**
 *
 * @author JD
 */
public class Cronometro extends Thread{
    javax.swing.JLabel lblTiempo;
    
    public Cronometro() {
        
    }
    
    @Override
    public void run() {
        int min = 0;
        int seg = 0;
        String minutos, segundos;
        
        try {
            while(true) {
                sleep(999);
                seg += 1;
                if(seg == 60) {
                    seg = 0;
                    min++;
                }
                
                if( min < 10 ) {
                    minutos = "0" + min;
                } else {
                    minutos = String.valueOf(min);
                }
                
                if( seg < 10 )  {
                    segundos = "0" + seg;
                } else {
                    segundos = String.valueOf(seg);
                }
                
                lblTiempo.setText(minutos+":"+segundos);
            }
        }catch(Exception e) {
            lblTiempo.setText("00:00");
        }
    }
    
    public int contador(int contador) {
        return contador;
    }
    
    public void LabelTiempo(javax.swing.JLabel lblTiempo) {
        this.lblTiempo = lblTiempo;
    }
    
}
