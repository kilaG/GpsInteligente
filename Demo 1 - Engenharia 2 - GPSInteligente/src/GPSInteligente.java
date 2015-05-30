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
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;


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
	 */
	public GPSInteligente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 587);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuItem mntmArquivo = new JMenuItem("Arquivo");
		mntmArquivo.setBounds(0, 0, 85, 22);
		contentPane.add(mntmArquivo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(10, 33, 564, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVelocidadeAtual = new JLabel("Velocidade Atual");
		lblVelocidadeAtual.setBounds(32, 11, 221, 37);
		panel.add(lblVelocidadeAtual);
		lblVelocidadeAtual.setHorizontalAlignment(SwingConstants.LEFT);
		lblVelocidadeAtual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel label = new JLabel("80");
		label.setBounds(369, 11, 55, 37);
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblKmh = new JLabel("km/h");
		lblKmh.setBounds(423, 11, 68, 37);
		panel.add(lblKmh);
		lblKmh.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblVelocidadeIdeal = new JLabel("Velocidade Ideal");
		lblVelocidadeIdeal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVelocidadeIdeal.setBounds(33, 66, 240, 37);
		panel.add(lblVelocidadeIdeal);
		
		JLabel label_1 = new JLabel("60");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_1.setBounds(369, 68, 55, 33);
		panel.add(label_1);
		
		JLabel lblKmh_1 = new JLabel("km/h");
		lblKmh_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblKmh_1.setBounds(423, 68, 68, 33);
		panel.add(lblKmh_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.scrollbar);
		panel_1.setBounds(0, 165, 584, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnModoInteligente = new JButton("Modo Inteligente");
		btnModoInteligente.setBounds(10, 11, 210, 44);
		panel_1.add(btnModoInteligente);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(0, 242, 584, 307);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Dropbox\\Codigos\\Demo 1 - Engenharia 2 - GPSInteligente\\src\\Mapa.jpg"));
		lblNewLabel.setBounds(0, 0, 584, 307);
		panel_2.add(lblNewLabel);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setBounds(479, 0, 105, 22);
		contentPane.add(mntmAjuda);
	}
}
