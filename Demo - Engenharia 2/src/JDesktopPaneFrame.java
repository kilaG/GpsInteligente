/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


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
                
		//------------------------------------------------------------------

        JMenuItem itemSalvar = new JMenuItem("Salvar");
    	JMenuItem itemAbrir = new JMenuItem("Abrir");
    	JMenuItem itemNovo = new JMenuItem("Novo");
    	JMenuItem itemSair = new JMenuItem("Sair");
    	
        JMenuBar menubar = new JMenuBar();

		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);

		
		//------------------------------------------------------------------

		menuArquivo.add(itemNovo);
		menuArquivo.add(itemAbrir);
		menuArquivo.add(itemSalvar);
		menuArquivo.add(itemSair);
		menubar.add(menuArquivo);

		menubar.add(Box.createHorizontalGlue());

		this.setJMenuBar(menubar);
        
		//------------------------------------------------------------------
	
		JMenu menuAjuda = new JMenu("Ajuda");
		menuAjuda.setMnemonic(KeyEvent.VK_J);
		
		menubar.add(menuAjuda);
		
    }
    
    
    
}
