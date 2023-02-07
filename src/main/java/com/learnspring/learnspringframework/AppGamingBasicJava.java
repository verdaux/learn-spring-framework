package com.learnspring.learnspringframework;

import com.learnspring.learnspringframework.game.GameRunner;
import com.learnspring.learnspringframework.game.MarioGame;
import com.learnspring.learnspringframework.game.pacmanGame;
import com.learnspring.learnspringframework.game.superContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args)
	{
		//var marioGame = new MarioGame(); 
		//var superContrGame = new superContraGame();
		//var game = new superContraGame();
		//var game = new MarioGame(); 
		var game = new pacmanGame(); 
		var gameRunner = new GameRunner(game);
		//game is a dependency of the GameRunner class
		gameRunner.run();
	}

}
