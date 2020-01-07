package functionalInterfaces;

import java.util.function.Predicate;;

public class PredicateExample {

	/**
	 * Predicate in sarti adinizin uzunluguna gore dogruysa "Dogru" yazdiran bir metod yazin
	 * @param supplier
	 */
	public void printResult(Predicate<String> predicate)
	{
		if(predicate.test("Aysenur"))
			System.out.println("Dogru");
		if(predicate.test("Ada"))
			System.out.println("Dogru");
	}
	
	/**
	 * printResult metodunu "Dogru" yazdiracak bir sart ile cagiriniz.
	 * @param args
	 */
	public static void main(String args[])
	{
		PredicateExample predicateExample = new PredicateExample();
		predicateExample.printResult(a -> a.length()>3);
	}
	

}
