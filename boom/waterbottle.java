package boom;

import java.awt.Color;
import java.awt.Graphics2D;

public class waterbottle extends projectile {
	
	public waterbottle(String theText, int x, int y, int dx, int dy, Color projectileColor) {
		super(theText,x, y, dx, dy, projectileColor);
		
//		this.explodeTime = 400;

	}
	
	@Override
	public void Paint(Graphics2D g2d) {
		g2d.setColor(projectileColor);
		g2d.fillRect(x, y, this.size, this.size);
			
	}
	
	public void explode() {
		isExplode = true;
//		this.x = 0;
//		this.y = 0;
		this.dx = 0;
		this.dy = 0;
		projectileColor = Color.BLUE;
		System.out.println("WATER BOTTLE EXPLODE!!!!!!!!!!!!!!!!!!!! \n");	
	}
	

}



