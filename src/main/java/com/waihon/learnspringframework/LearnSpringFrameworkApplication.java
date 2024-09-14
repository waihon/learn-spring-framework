package com.waihon.learnspringframework;

import com.waihon.learnspringframework.game.GameRunner;
import com.waihon.learnspringframework.game.MarioGame;
import com.waihon.learnspringframework.game.PacmanGame;
import com.waihon.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		PacmanGame game = new PacmanGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}
}
