package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
	
	private String name;

	/**
	 * Consumer in sahip oldugu adi name'e set eden ve yazdiran bir metod yazin
	 * @param supplier
	 */
	public void printName(Consumer<String> consumer)
	{

		System.out.println(name);
	}
	
	/**
	 * printName metodunu kendi adinizi yazdiracak sekilde cagiriniz.
	 * @param args
	 */
	public static void main(String args[])
	{
		ConsumerExample consumerExample = new ConsumerExample();
		Consumer<String> c = ad -> consumerExample.name = ad;
		c.accept("frete");
		consumerExample.printName(ad -> consumerExample.name = ad);
		consumerExample.printName(c);
	}
	

}
