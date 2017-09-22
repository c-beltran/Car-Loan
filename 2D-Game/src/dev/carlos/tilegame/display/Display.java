package dev.carlos.tilegame.display;

/*
 * This class will be the one
 * used to display our window
 */

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	//creating a window using Jframe
	private JFrame frame;
	//canvas allows us to draw graphics/images
	private Canvas canvas;
	/*
	 * Jframe needs 3 things
	 * Title, Height and Width
	 */
	private String title;
	private int width, height; //we will use them in pixels

	//constructor
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
	
		createDisplay(); 
	}
	/*
	 * Window creation
	 */
	private void createDisplay(){
		frame = new JFrame(title);//sets the JFrame a  title
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //very important line of code, if missing window will close but programs will run in the background
		frame.setResizable(false); //allows user to resize window but we wont allow that
		frame.setLocationRelativeTo(null); // window will appear in the center rather than the side.
		frame.setVisible(true);
		
		//setting up canvas
		canvas =  new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));//setting up the size the size of the canvas, you use Dimension()
		canvas.setPreferredSize(new Dimension(width, height));//max height we want
		canvas.setPreferredSize(new Dimension(width, height));//min size we want
				
		//add canvas to JFrame
		frame.add(canvas);
		frame.pack();
	}
	
	public Canvas getCanvas(){
		return canvas;
	}

}
