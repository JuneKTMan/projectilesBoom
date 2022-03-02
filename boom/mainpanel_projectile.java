package boom;

import java.awt.Color;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.Timer;

public class mainpanel_projectile {
	
	static Timer timer;
	
	static DrawPanel d = new DrawPanel();
	
	String DrawPanelName;
	
	public mainpanel_projectile() {
		DrawPanelName = "EMISSION!!!";
	}

	public static void main(String[] args) {
		
		mainpanel_projectile dname = new mainpanel_projectile();
		List<String>list = new ArrayList<String>();
		list.add("orangeboom");
		list.add("waterboom");
		list.add("waterbottle");
		
		for(String projectile:list)
			System.out.println(projectile);
		
		System.out.println(dname.DrawPanelName);
		// set up the Frame
		JFrame frame = new JFrame();
		//set frame size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.setContentPane(d);

		frame.getRootPane().setBackground(Color.LIGHT_GRAY);

		// Listener
		timer = new Timer(10, d);
		timer.setInitialDelay(10);
		timer.setCoalesce(true);
		timer.start();
	
//		System.out.println("Orange here");


		
	}

}
