package org.somya.SpringDemo.game;

public class SuperContra implements GamingConsole{
	
	public void up() {
		System.out.println("climbing");
	}

	public void down() {
		System.out.println("crouching");
	}

	public void left() {
		System.out.println("shooting");
	}

	public void right() {
		System.out.println("accelerate");
	}
}
