package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.MarioGame;
import com.learnspring.learnspringframework.game.superContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args)
	{
		var marioGame = new MarioGame();
		var superContrGame = new superContraGame();
		var gameRunner = new GameRunner(superContrGame);
		gameRunner.run();
	}

}
