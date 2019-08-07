import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	// ��images�ļ����л�ȡͼƬ�Ķ���
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100;
	double y = 100;

	boolean right = true;

	// �����ڷ���
	public void paint(Graphics g) {
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int) x, (int) y, null);

		if (right) {
			x = x + 10;
		} else {
			x = x - 10;
		}
		if (x > 865 - 40 - 30) {
			right = false;
		}

		if (x < 40) {
			right = true;
		}
	}

	// ���ش���
	void loadwindows() {
		setSize(856, 500);
		setLocation(40, 40);
		setVisible(true);

		while (true) {
			try {
				repaint();
				Thread.sleep(40);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}

	}

	// ����java���������
	public static void main(String[] args) {

		System.out.println("������Ϸ");

		BallGame game = new BallGame();
		game.loadwindows();

	}

}
