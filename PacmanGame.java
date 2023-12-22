package org.somya.SpringDemo.game;

public class PacmanGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("move up");
	}

	@Override
	public void down() {
		System.out.println("move below");
	}

	@Override
	public void left() {
		System.out.println("move back");
	}

	@Override
	public void right() {
		System.out.println("move forward");
	}
}
