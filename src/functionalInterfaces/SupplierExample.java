package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
	
	/**
	 * supplier in sahip oldugu adi yazdiran bir metod yazin
	 * @param supplier
	 */
	public void printName(Supplier supplier)
	{
		System.out.println(supplier.get());
	}
	
	/**
	 * printName metodunu kendi adinizi yazdiracak sekilde cagiriniz.
	 * @param args
	 */
	public static void main(String args[])
	{
		SupplierExample supplierExample = new SupplierExample();
		Supplier supplier = () ->  "Aysenur";
		supplierExample.printName(supplier);
	}
	

}
