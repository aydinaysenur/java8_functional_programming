package functionalInterfaces;

import java.util.function.Function;;

public class FunctionExample {

	/**
	 * Kendi adinizi verilen fonksiyona uygulayan ve sonucu yazdiran bir metod yazin
	 * @param supplier
	 */
	public void printResult(Function<String, Integer> function)
	{
		
		System.out.println(function.apply("Aysenur"));
	}
	
	/**
	 * printResult metodunu kendi adinizin uzunlugunu yazdiracak sekilde cagiriniz.
	 * @param args
	 */
	public static void main(String args[])
	{
		FunctionExample functionExample = new FunctionExample();
		functionExample.printResult(ad -> ad.length());
	}
	

}
