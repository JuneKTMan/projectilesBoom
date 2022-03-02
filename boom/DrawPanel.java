package boom;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel implements ActionListener {
	

	orangeboom o1 = new orangeboom("orange 1", 0, 50, 8, -8, Color.ORANGE);
	waterboom w1 = new waterboom("water 1", 50, 50, 5, -8, Color.PINK);
	waterbottle w2 = new waterbottle("water 2", 80, 50, 3, -8, Color.BLACK);

	
	public DrawPanel() {
		o1.start();
		w1.start();
		w2.start();
	}
	
	
	
	public void paintComponent(Graphics g) {
//		System.out.println("projectile emission");
		
		BufferedImage bufferedImage = new BufferedImage(this.getWidth(), 
				this.getHeight(), BufferedImage.TYPE_INT_BGR);
		//Graphic display
		Graphics2D g2d = bufferedImage.createGraphics();
		g2d.setColor(getBackground());
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		

		
		o1.Paint(g2d);
		w1.Paint(g2d);
		w2.Paint(g2d);
		
		
		Graphics2D g2dComponent = (Graphics2D) g;
		g2dComponent.drawImage(bufferedImage, null, 0, 0);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.repaint();
		
		
	}
	
	
	
}
