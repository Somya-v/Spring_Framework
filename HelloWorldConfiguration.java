package BasicExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

class Person {
	private String name;
	private int age;
	private Address address;

	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

class Address {
	private String city;
	private String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() { // spring bean
		return "Somya";
	}
	@Bean
	public int age() {
		return 23;
	}
	@Bean
	public Person person() {
		return new Person("Rohan", 24, new Address("delhi", "delhi"));
	}
	@Bean
	public Person person2() { // we will use existing beans name and age
		return new Person(name(), age(), address());
	}
	@Bean
	public Person person3parameters(String name, int age, @Qualifier("addressqualifier")Address address) { // we will use existing beans name and age																					// and age
		return new Person(name, age, address);

	}
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Saharanpur", "UP");
	}
	@Bean(name = "address3")
	@Qualifier("addressqualifier")
	public Address address3() {
		return new Address("Agra", "UP");
	}
}
