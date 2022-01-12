
package OG.hola_mundoFrame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author acer
 */
public class Frame1 extends Frame{
    
    
    public void inicomponet(){
    primer_ventana();
    }
    
   
    private Button bt1;
          
  public void primer_ventana(){
   Frame F = new Frame();
   F.setLayout(null);
     F.setBounds(0, 0, 300, 500);
     F.setLocationRelativeTo(null);
     F.setVisible(true);
     F.addWindowListener(new WindowAdapter(){
         @Override
         public void windowClosing(WindowEvent F){
             System.exit(0);
         }
     });
     
     Panel p = new Panel();
     p.setLayout(null);
     p.setBounds(0, 0, 500, 200);
     p.setBackground(Color.red);
     F.add(p);
     
    Button bt1 = new Button("click:) ");        
      bt1.setBounds(30, 50, 90,50 );
      bt1.setBackground(Color.cyan);
      //bt1.addActionListener(l);
    //  bt1.setVisible(true);
      p.add(bt1);
      
      
      
      
      
      
      
      
      
      
  }

// Botones
  
  
  public void boton(){
     
     
  
  }
  
    
}
