import java.awt.*;
import javax.swing.*;

public class rendered extends JPanel{
	public static final long serialVersionUID=1L;

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		game.flappyBird.repaint(g);
	}
}
