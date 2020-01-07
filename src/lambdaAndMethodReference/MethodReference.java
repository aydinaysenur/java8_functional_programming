package lambdaAndMethodReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
	public static void main(String[] args) {
		
		MethodReference methodReference = new MethodReference();
		
		//static method ornegi
		methodReference.transformStaticMethod();
		
		//constructor ornegi
		methodReference.transformInt2Integer();
		
		//instance method ornegi		
		methodReference.transformInstanceMethodReference();
		
		//diger instance method ornegi		
		methodReference.transformInstanceMethodReference2();
		
	}
	
	/**
	 * Instance method cagiran lambda ifadesini 
	 * method reference tarzinda yeniden yaziniz.
	 */
	public void transformInstanceMethodReference()
	{
		MethodReference methodReference = new MethodReference();
		Runnable singleDigitNumberList = () -> methodReference.createRunnable();
		
		String[] stringArray = { "Aysenur", "Nazli", "Volkan", "Emre", "Erdal", "Binnaz", 
				"Hayrettin", "Ece", "Caglar" };
		
		Arrays.sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		
	}
	
	/**
	 * Instance method cagiran lambda ifadesini 
	 * method reference tarzinda yeniden yaziniz.
	 */
	public void transformInstanceMethodReference2()
	{
		String[] rosterAsArray = {"Aysenur", "Nazli", "Volkan", "Emre"};
		
		MethodReference methodReference = new MethodReference();
		Arrays.sort(rosterAsArray, (s1, s2) -> methodReference .compareByName(s1, s2) );
		Arrays.sort(rosterAsArray, methodReference ::compareByName );
		
		
	}
	
	
	/**
	 * Functional bir interface objesi dondurur
	 */
	public Runnable createRunnable()
	{	
		return () -> System.out.println("");
	}
	
	
	/**
	 * Static method cagiran lambda ifadesini 
	 * method reference tarzinda yeniden yaziniz.
	 */
	public void transformStaticMethod()
	{
		//listemizi olusturalim.
		List<Integer> numberList = new ArrayList<>();
		numberList.add(new Integer(1));
		numberList.add(new Integer(2));
		numberList.add(new Integer(3));
		numberList.add(new Integer(4));
		numberList.add(new Integer(7));
		numberList.add(new Integer(8));
		numberList.add(new Integer(9));
		
		//static printTextOfNumbers methodumuzu her liste elemani icin cagiralim.
		numberList.forEach(MethodReference::printTextOfNumbers);
	}
	
	/**
	 * Sayilarin Turkce yazi karsiliklarini dondurur.
	 * @param number
	 * @return text
	 */
	public static void printTextOfNumbers(Integer number)
	{
		String text = "Bilmiyorum";
		
		switch(number)
		{
			case 1:
				text = "Bir";
				break;
			case 2:
				text = "Ýki";
				break;
			case 7:
				text = "Yedi";
				break;
			case 8:
				text = "Sekiz";
				break;
			case 9:
				text = "Dokuz";
				break;
		}
		
		System.out.println(text);
	}
	
	/**
	 * Yeni Integer objesi olusturan lambda ifadesini 
	 * method reference tarzinda yeniden yaziniz.
	 */
	public void transformInt2Integer()
	{
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		
		numberList.forEach(Integer::new);
	}
	
	/**
	 * iki string degeri karsilastiran metoddur.
	 * @param a
	 * @param b
	 * @return
	 */
    public int compareByName(String a, String b) 
    {
        return a.compareTo(b);
    }

}
