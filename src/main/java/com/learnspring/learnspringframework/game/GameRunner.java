package com.learnspring.learnspringframework.game;

public class GameRunner {
	
	private superContraGame game;

	public GameRunner(superContraGame superContrGame) {
		this.game = superContrGame;
	}

	public void run() {
		System.out.println("Running game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
