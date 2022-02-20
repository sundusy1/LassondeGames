package lassondeGames;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player {
	private int x,y;
	private ImageIcon player;
	private JLabel pl;
	private final int width =25;
	private final int height =25;
	
	public Player(ImageIcon pl, int x, int y) {
		this.player = pl;
		this.x = x;
		this.y = y;
		setPl();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon getPlayer() {
		return player;
	}
	public JLabel getPl() {
		return this.pl;
	}
	public void setPl() {
		pl = new JLabel();
		pl.setBounds(this.x, this.y, width, height);
		pl.setIcon(this.player);
	}
	
	//player movements
	public void moveLeft() {
		this.pl.setLocation(x-=5, y);
	}
	public void moveRight() {
		this.pl.setLocation(x+=5, y);
	}
	//i somehow messed up my coordinates so 
	//y+=5 was going down instead of up
	public void moveUp() {
		this.pl.setLocation(x, y-=5);
	}
	public void moveDown() {
		this.pl.setLocation(x, y+=5);
	}
	
	
}
