package lambdaAndMethodReference;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JButton;

public class Lambda {

	public static void main(String[] args) {
		
		Lambda lambda = new Lambda();

		//lambda syntax alistirma 1
		lambda.transformActionListener();
		
		//lambda syntax alistirma 2
		lambda.transformComparator();
	}
	
	
	/**
	 * Eski usul olusturulmus runnable objesini
	 * lambda syntax'ina gore donusturup tekrar calistirin.
	 */
	public void transformActionListener()
	{
		JButton buton = new JButton();

		ActionListener listener =  e -> {
				for( int i = 1; i <= 3; i++)
				{
					System.out.println("Selam ICterra! " + i);
				}   				
			};
		
		buton.addActionListener(listener);
		buton.doClick();
	}
	
	/**
	 * 1. Eski usul olusturulmus comparator objesini 
	 * 	  lambda syntax'ina gore donusturup tekrar calistirin.
	 * 
	 * 2. Collections sinifindaki static sort methodu yerine 
	 *    List sinifindaki sort metodunu kullanin.
	 *    
	 * 3. for dongusunde yapilan isleri forEach metodu ile yapin.
	 * 	  
	 */
	public void transformComparator()
	{
		//isim listesi olusturalim
		List<String> isimListesi = new ArrayList<>();
		isimListesi.add("Emre");
		isimListesi.add("Binnaz");
		isimListesi.add("Erdal");
		isimListesi.add("Aysenur");
		isimListesi.add("Hayrettin");
		isimListesi.add("Ece");
		isimListesi.add("Caglar");
		isimListesi.add("Nazli");
		
		//alfabetik siraya gore siralayalim
		Collections.sort(isimListesi);
		
		
		//listemizi yazdiralim
		for(String isim : isimListesi)
		{
			System.out.println(isim);
		}

		//listemizdeki isimleri kisadan uzuna siralayacak bir karsilastirici olusturalim
		Comparator<String> comparator = (String o1, String o2) -> {    
			    return o1.length()-o2.length();
			   }; 
		
		//isim listemizi olusturdugumuz karsilastiriciyi kullanarak siralayalim
		//Collections.sort(isimListesi, comparator);
		isimListesi.sort((String o1, String o2) -> {    
		    return o1.length()-o2.length();
		   });
		
		System.out.println("------------------------------");
		
		isimListesi.forEach(isim -> System.out.println(isim));
		
		//listemizi yazdiralim.
		for(String isim : isimListesi)
		{
			System.out.println(isim);
		}
	}

}
