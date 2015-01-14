//importing graphic stuff

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//main class to play the game
//Jpanel is what displays

public class Game extends JPanel {
	//initiating a ball
	Ball ball = new Ball(this);
	//initiating a paddle
	Paddle paddle = new Paddle(this);
	//constructors
	public Game() {
		//watches keys to detect input
		addKeyListener(new KeyListener() {
			//pressing e
			public void keyTyped(KeyEvent e) {
			}

			//releasing e
			//triggers whatever the paddle does on release of key
			public void keyReleased(KeyEvent e) {
				paddle.keyReleased(e);
			}

			//pressing vs typing: pressing detects a push on the button typing detects pressing and releasing
			//triggers whatever the paddle does when e is pressed
			public void keyPressed(KeyEvent e) {
				paddle.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	//Just an organization thing to move the ball and the paddle
	private void move() {
		ball.move();
		paddle.move();
	}

	//THis displays everything
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
		paddle.paint(g2d);
	}
	//Triggers gameover screen and program exit
	public void gameOver() {
		JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
	}
	//Displays more stuff on the screen initiates jframe and game
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		Game game = new Game();
		frame.add(game);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//refreshing scren
		while (true) {
			game.move();
			game.repaint();
			Thread.sleep(7);
		}
	}
}
