import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;


public class GPSInteligente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GPSInteligente frame = new GPSInteligente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public GPSInteligente() throws ClassNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBounds(97, 348, 61, 40);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel label = new JLabel("- 10");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(10, 11, 46, 18);
		panel_6.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(533, 248, 109, 73);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JRadioButton rdbtnDesativado = new JRadioButton("Desativado");
		rdbtnDesativado.setBounds(0, 50, 109, 23);
		panel_4.add(rdbtnDesativado);
		rdbtnDesativado.setBackground(Color.DARK_GRAY);
		rdbtnDesativado.setForeground(Color.RED);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ativado");
		rdbtnNewRadioButton.setBounds(0, 24, 109, 23);
		panel_4.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(Color.CYAN);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		
		JLabel lblModoInteligente = new JLabel("Modo Inteligente");
		lblModoInteligente.setForeground(Color.GREEN);
		lblModoInteligente.setBounds(10, 0, 99, 23);
		panel_4.add(lblModoInteligente);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 642, 21);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(0, 0, 97, 21);
		panel_5.add(menuBar_2);
		
		JMenu mnNewMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar_2.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sair");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(545, 0, 97, 21);
		panel_5.add(menuBar_1);
		
		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 225, 158, 50);
		contentPane.add(panel_1);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Atual: 80 km/h");
		lblNewLabel.setBounds(10, 11, 141, 36);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setToolTipText("");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(303, 21, 299, 35);
		contentPane.add(panel_2);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setLayout(null);
		
		JLabel lblAvenida = new JLabel("Avenida Jo\u00E3o Pessoa");
		lblAvenida.setBounds(10, 11, 279, 14);
		panel_2.add(lblAvenida);
		lblAvenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAvenida.setForeground(Color.CYAN);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 287, 158, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdealKmh = new JLabel("Ideal: 60 km/h");
		lblIdealKmh.setBounds(10, 11, 132, 25);
		panel.add(lblIdealKmh);
		lblIdealKmh.setForeground(Color.GREEN);
		lblIdealKmh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(593, 111, 49, 52);
		contentPane.add(panel_3);
		
		JLabel lblMarcarRota = new JLabel("Rota");
		lblMarcarRota.setBounds(10, 11, 30, 30);
		panel_3.add(lblMarcarRota);
		lblMarcarRota.setForeground(Color.RED);
		lblMarcarRota.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		//----------------------------------------------------------------------------------------------------
	
		
		
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Dropbox\\Codigos\\Demo 1 - Engenharia 2 - GPSInteligente\\src\\mapa.png"));
		URL url = GPSInteligente.class.getResource("/mapa.png");
		lblNewLabel_1.setIcon(new ImageIcon(url));
		
		
		//----------------------------------------------------------------------------------------------------

		lblNewLabel_1.setBounds(-171, 21, 813, 378);
		contentPane.add(lblNewLabel_1);
		

		ImageIcon mapa = new ImageIcon("src/mapa.png");
	}
}