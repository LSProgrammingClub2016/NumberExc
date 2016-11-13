package DrawGeom;

import DrawGeom.CH3Package.*;

//import javax.swing.*;






import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawShapes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		JFrame myGUI = new JFrame();
		myGUI.setTitle("Testing Geometric Shape Draw");
		myGUI.setSize(300, 300);
		myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myGUI.setVisible(true);
		
		JPanel panel = new JPanel();
		Color color = new Color(1,0,0,0);
		panel.setBackground (Color.white);
		
		Container pane = myGUI.getContentPane();
		pane.add(panel);
		
		Graphics gc = pane.getGraphics();
		
		gc.setColor(Color.black);  //sets foreground
		pane.setBackground(Color.white);
		
		//gc.drawString("Hello", 5, 25);
		
		// doing this before drawString results in 
		// a transparent pane
		//pane.setBackground(Color.white);
		
		// without the sleep, the rendering just shows background ???
		try
		{
    		Thread.sleep(1000);
		} 
		catch(InterruptedException ex) 
		{
    		Thread.currentThread().interrupt();
		}
			
    	gc.drawLine(0, 0,  2000, 3000);
    	
    	
    	    	//for the geometric shapes    	
		gc.setColor(Color.black);
		
		CustTriangle localTriangle = new CustTriangle (gc, 20, 20);
		localTriangle.draw(50, 100, 10, 140);
		
		CustCircle localCirc = new CustCircle (gc, 100, 100);
		localCirc.draw(35);
		
		CustRectangle localRect = new CustRectangle (gc, 5, 150);
		localRect.draw(24,  56);	


		
		
	}

}
