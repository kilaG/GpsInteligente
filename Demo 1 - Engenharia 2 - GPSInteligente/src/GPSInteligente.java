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
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;


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
		setBounds(100, 100, 658, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(543, 285, 99, 52);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("M.I Ativado");
		lblNewLabel_2.setBounds(10, 11, 76, 30);
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(Color.GREEN);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(304, 33, 299, 35);
		contentPane.add(panel_2);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setLayout(null);
		
		JLabel lblAvenida = new JLabel("Avenida Jo\u00E3o Pessoa");
		lblAvenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAvenida.setForeground(Color.CYAN);
		lblAvenida.setBounds(10, 11, 279, 14);
		panel_2.add(lblAvenida);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Marcelo\\Dropbox\\Codigos\\Demo 1 - Engenharia 2 - GPSInteligente\\src\\mapa.png"));
		lblNewLabel_1.setBounds(-171, 33, 813, 369);
		contentPane.add(lblNewLabel_1);
		
		JMenuItem mntmArquivo = new JMenuItem("Op\u00E7oes");
		mntmArquivo.setBackground(Color.BLACK);
		mntmArquivo.setForeground(Color.WHITE);
		mntmArquivo.setBounds(0, 0, 85, 22);
		contentPane.add(mntmArquivo);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setBackground(Color.BLACK);
		mntmAjuda.setForeground(Color.WHITE);
		mntmAjuda.setBounds(557, 0, 85, 22);
		contentPane.add(mntmAjuda);
	}
}
