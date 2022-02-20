package lassondeGames;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TressureHunt {

	private JFrame frame;
	private ImageIcon map;
	private JLabel mapLabel;
	private Player pl;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TressureHunt window = new TressureHunt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TressureHunt() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//for background image of map.
		map = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/level6mapwb_resized.png")));
		mapLabel = new JLabel(map);
		mapLabel.setLocation(0, 0);
		mapLabel.setSize(905,881);
		
		frame = new JFrame("Tressure Hunt");
		//for player movement
		
		//setting up player arrow
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(TressureHunt.class.getResource("/Picture4.png")));
		pl = new Player(img,311,233);
		frame.getContentPane().add(pl.getPl());// to add player on top of background
		
		frame.getContentPane().add(mapLabel);//adds background image of map to the window
		frame.setBounds(100, 100, 927,937);
		//frame.setLocationRelativeTo(null);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//for player movement
		frame.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				int speed = 0;
				switch(e.getKeyChar()) {
				case 'w': 
					pl.moveUp();
					break;
				case 's':
					pl.moveDown();
					break;
				case 'a':
					pl.moveLeft();
					break;
				case 'd':
					pl.moveRight();
					break;
				}
				frame.repaint();//so that the pl can show up at new location
			}
		});
	}
}
