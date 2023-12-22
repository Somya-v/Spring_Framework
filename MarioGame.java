package org.somya.SpringDemo.game;

public class MarioGame implements GamingConsole{

	public void up() {
		System.out.println("Jumping");
	}
	
	public void down() {
		System.out.println("going in the pothole");
	}
	
	public void left() {
		System.out.println("moving backwards");
	}
	
	public void right() {
		System.out.println("moving forwards");
	}
}
