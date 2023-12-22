package BasicExample;

import java.util.Arrays;
import javax.naming.Context;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//spring can- create and manage objects
//spring has its own container - IOC container which reads the config file (will create/manage objects)
//bean- objects inside ioc container
//2 types of IOC container-: Bean Factory, Application Context (both are interfaces)
//spring IOC- creating the objects and injecting
public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// 1. Launch a spring context/ spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				HelloWorldConfiguration.class);

		// 2. Configure things that we want spring to manage using - @Configuration
		// Retreiving bean managed by spring
		System.out.println(context.getBean("name"));

		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("person3parameters"));

		System.out.println(context.getBean("address2")); // give bean name thats metioned along with annotation
		// otherwise give the method name

		System.out.println(context.getBean(Address.class)); // retreive using bean type
		
		Arrays.stream(context.getBeanDefinitionNames())
							 .forEach(n-> System.out.println(n)); //printing all the beans present
	}
}
