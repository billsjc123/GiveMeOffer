import java.awt.*;
public class BallGame extends Frame{
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100;
	double y = 100;

	double degree = 3.14 / 3;

	public void paint(Graphics g){
		System.out.println("draw one!");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);

		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);

		if(y > 480 - 30 - 20){
			degree = -degree;
		}
		if(x > 856 - 30 - 20){
			degree = 3.14 - degree;
		}
		if(x < 20){
			degree = 3.14 - degree;
		}
		if(y < 20 + 20){
			degree = -degree;
		}
	}

	public void launchFrame(){
		setSize(856, 480);
		setLocation(50, 50);
		setTitle("My BallGame");
		setVisible(true);

		while(true){
			repaint();
			try{
				Thread.sleep(40);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String [] args){
		System.out.println("Game Start!");
		BallGame bg = new BallGame();
		bg.launchFrame();
	}
}