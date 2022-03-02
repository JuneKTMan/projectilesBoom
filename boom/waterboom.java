package boom;

import java.awt.Color;
import java.awt.Graphics2D;

public class waterboom extends projectile {

	public waterboom(String theText, int x, int y, int dx, int dy, Color projectileColor) {
		super(theText,x, y, dx, dy,projectileColor);
		
//		this.explodeTime = 400;

	}
	
	@Override
	public void Paint(Graphics2D g2d) {
		g2d.setColor(projectileColor);
		g2d.fillArc(x, y, this.size, this.size, 0, 50);
	}

	public void explode() {
		isExplode = true;
//		this.x = 0;
//		this.y = 0;
		this.dx = 0;
		this.dy = 0;
		projectileColor = Color.GREEN;
		System.out.println("WATERBOOM EXPLODE!!!!!!!!!!!!!!!!! \n");	
	}



}
