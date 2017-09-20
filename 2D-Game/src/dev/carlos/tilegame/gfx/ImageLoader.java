package dev.carlos.tilegame.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/*
 * This class will only do one thing
 * Load Images
 */

public class ImageLoader {
	//we make this static so we can access from anywhere
	//String path will be the location of our image
	public static BufferedImage loadImage(String path){
		try {
			//this is how we load an image in java
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//in order for us to exit
			System.exit(1);
		}
		//return null so we get rid of all errors
		return null;
	}
}
