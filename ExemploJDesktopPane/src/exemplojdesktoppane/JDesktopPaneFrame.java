/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplojdesktoppane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Marcelo
 */
class JDesktopPaneFrame extends JFrame{

    public JDesktopPaneFrame() {
        super("JDesktopPane Frame");
        iniciaComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setVisible(true);
    }

    private void iniciaComponentes() {
        JDesktopPane painelDesktop = new JDesktopPane();
        painelDesktop.setLayout(null);
              
//        JInternalFrame frame = new JInternalFrame("Frame1");
//        frame.setResizable(true);
//        frame.setClosable(true);
//        frame.setSize(200,200);
//        frame.setVisible(true);
//        //frame.add(new JButton("Botao"));
//        painelDesktop.setSelectedFrame(frame);
//        painelDesktop.add(frame);
        
        getContentPane().add(painelDesktop);
                
                
        
    }
    
    
    
}
