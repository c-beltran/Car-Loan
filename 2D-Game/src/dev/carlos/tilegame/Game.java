package dev.carlos.tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import dev.carlos.tilegame.display.Display;

/*
 * main class for our game.
 * it will hold the base code and it will close everything.
 * basically everything you do in your game will happen here.
 */

//we use runnable so class can use threads
public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;
	
	private boolean running =  false;
	private Thread thread;//mini program that runs within the big program
	
	/*
	 * variables to access the canvas
	 * and perform the rendering code 
	 */
	private BufferStrategy bs;
	private Graphics graphics;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	private void init(){
		display = new Display(title, width, height);
	}
	
	private void update(){
		
	}
	
	private void render(){
		/*
		 * this will set the current bufferstrategy to bs
		 * bufferstrategy is a (hidden screen) way to tell the computer 
		 * on how to draw things to the screen. uses buffers to do that.
		 */
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			//if there are no buffers create buffer maxhold is 3
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		//start to start drawing (using our graphics object)
		//it allow us to draw to the canvas
		graphics = bs.getDrawGraphics();//creates the paintbrush
		//Start of Drawing
		graphics.fillRect(0, 0, width, height);
		
		//End of Drawing
		bs.show();
		graphics.dispose();
	}
	
	//must have this class when implementing runnable
	public void run(){
		init();
		//game loop - runs all the time
		while(running){
			update();
			render();
		}
		stop();
	}

	//this method is to start the mini program(game)
	//we use the word synchronied when we want to acess the runnable class directly
	public synchronized void start(){
		if(running){//if game is already running and is = to true just return
			return;
		}//else set running to true and continue.
		running = true;
		thread = new Thread(this);//we want to thread this method
		thread.start();
		
	}
	
	public synchronized void stop(){
		if(!running){//if game is already stopped, return
			return;
		}//else continue
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
