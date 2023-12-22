package org.somya.SpringDemo;

import org.somya.SpringDemo.game.GameRunner;
import org.somya.SpringDemo.game.GamingConsole;
import org.somya.SpringDemo.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole gamingConsole() {
		return new PacmanGame();
	}

	@Bean
	public GameRunner game(GamingConsole gamingConsole) {
		return new GameRunner(gamingConsole);
	}
}
