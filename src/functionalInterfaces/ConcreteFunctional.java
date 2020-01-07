package functionalInterfaces;

import java.time.LocalDateTime;

public class ConcreteFunctional {
	
	public void useGetNameMethod(IFunctionalInterface functionalInterface)
	{
		System.out.println(functionalInterface.getName());
	}
	
	/**
	 * useGetNameMethod methodunu IFunctionalInterface interface'ini implement eden
	 * hicbir class yokken cagiriniz.
	 */
	public static void main(String args[])
	{
		ConcreteFunctional concreteFunctional = new ConcreteFunctional();
		concreteFunctional.useGetNameMethod(() -> "Aysenur");
	}
}
