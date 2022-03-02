package boom;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;



public abstract class projectile extends Thread {


	int x = 0;
	int y = 0;
	int dx = 0;
	int dy = 0;

	int ddx = 0;
	int ddy = 0;
	
	int explode = 1;
	int explodeTime = 0;
	
	int size = 30;
	int speedx = 2;
	int speedy = 2;
	
	boolean isExplode = false;
	boolean collision = false;
	
	
//	protected int explodeTime = 700;
	
	String projectileName;
	Color projectileColor;
	String[] projectiles = {"orangeboom", "waterboom", "waterbottle"};
	
	
	
	public projectile(String theText, int x, int y, int dx, int dy, Color projectileColor) {
		this.projectileName = theText;
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.projectileColor = projectileColor;
		
		this.size = size;
		this.speedx = speedx;
		this.speedy = speedy;
		
		
	}
	
	public void moveIt() {
		this.x = this.x + this.dx; 
		this.y = this.y + this.dy; 
		this.rebounce();
						
	}
	
	public void explodeTime() {
		if (this.explodeTime == 20) {
		this.explode();
		}
	}
	
	
	
	//rebounce object
	//Flubber method
	public void rebounce() {
						
		if (this.x <= 0) {
			this.dx = -this.dx;
			this.dx = this.dx + speedx + 10;
			++this.explodeTime;
			this.reSize();
			
			
		}
		
		if (this.y <= 0) {
			this.dy = -this.dy;
			this.dy = this.dy + speedy + 10;
			++this.explodeTime;
			this.reSize();
			
					
		}
		
		if (this.x >= 750) {
			this.dx = -this.dx;
			this.dx = this.dx - speedx - 10;
			++this.explodeTime;
			this.reSize();
						
		}
		
		if (this.y >= 450) {
			this.dy = -this.dy;
			this.dy = this.dy - speedy - 10;
			++this.explodeTime;
			this.reSize();
						
		}
		
	}
	
//	public void addSpeed() {
//		
//			this.x = this.x --;
//			this.y = this.y --;
//			this.dx = this.dx --;
//			this.dy = this.dy --;
//
//	}
		

	public void reSize() {
		
		this.size = this.size + 10;
		
	}
	
	public void run() {
//while (y < =450)
		while (!isExplode) {
			
			moveIt();

			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			if (this.x <= 0) {
				this.x = 0;				
//				this.rebounce();
//				this.addSpeed();
				this.explodeTime();
				this.reSize();
			}
			
			if (this.y <= 0) {
				this.y = 0;
//				this.rebounce();
//				this.addSpeed();
				this.explodeTime();
				this.reSize();
			}
			
			if (this.x >= 750) {
				this.x = 750;
//				this.rebounce();
//				this.addSpeed();
				this.explodeTime();
				this.reSize();
			}
			
			if (this.y >= 450) {
				this.y = 450;
//				this.rebounce();
//				this.addSpeed();
				this.explodeTime();
				this.reSize();
			}
			

			
			//simulation of the gravity
//			this.dy = this.dy + 1;
						
			System.out.println("x= " + x + " | " + "y= " + y + " | " + "dx= " + dx + " | " + "dy= " + dy);
			
		}
		

//		explode();
		
		
	}
		
	abstract void explode();
	

	// Draw the projectile
	public void Paint(Graphics2D g2d) {
		g2d.setColor(projectileColor);
		g2d.fillOval(x, y, this.size, this.size);
			
	}
	

	
//	public void collision() {
//		
//		if (this.x <= 0) {
//			collision = true;
//		}
//		
//		if (this.y <= 0) {
//			collision = true;
//		}
//		
//		if (this.x >= 750) {
//			collision = true;
//		}
//		
//		if (this.y >= 450) {
//			collision = true;
//		}
//	}
	
	
}
