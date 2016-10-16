class PrzykladowaKlasa{
	float przykladowaZmienna;
}
public class cw2str97 {
	public static void main(String [] args){	
		PrzykladowaKlasa przyklad1 = new PrzykladowaKlasa();
		PrzykladowaKlasa przyklad2 = new PrzykladowaKlasa();
		przyklad1.przykladowaZmienna = 1.2f;
		przyklad2.przykladowaZmienna = 2.1f;
		System.out.println(przyklad1.przykladowaZmienna);
		System.out.println(przyklad2.przykladowaZmienna);
		przyklad1 = przyklad2;
		System.out.println(przyklad1.przykladowaZmienna);
		System.out.println(przyklad2.przykladowaZmienna);
	}
}
