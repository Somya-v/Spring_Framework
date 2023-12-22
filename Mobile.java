package org.somya.SprinDemo.simExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
//		Sim sim= new Airtel();
//		sim.calling();
//		sim.data();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		// this is one way where we cast to the type of object we are receiving
//		Airtel air = (Airtel) context.getBean("airtel");
//		air.calling();
//		air.data();

//		// Another way is to add class as an argument
//		Airtel air1 = context.getBean("airtel", Airtel.class);

		// But the useful way is to use interface
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}
}
