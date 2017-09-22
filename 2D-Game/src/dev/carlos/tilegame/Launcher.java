package dev.carlos.tilegame;

import dev.carlos.tilegame.display.Display;

public class Launcher {

	public Launcher() {

	}

	public static void main(String args[]){
		//display screen
		Game game = new Game("Game On!", 600, 600);
		game.start();
	}
}
