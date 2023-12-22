package org.somya.SpringDemo;

import org.somya.SpringDemo.game.GameRunner;
import org.somya.SpringDemo.game.GamingConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		System.out.println(context.getBean(GamingConsole.class));
		context.getBean(GameRunner.class).run();
		context.getBean(GamingConsole.class).up();
	}
}
