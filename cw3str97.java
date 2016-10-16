class PrzykladowaKlasa{
	float przykladowaZmienna;
	void incr(PrzykladowaKlasa inkrementowana){
		inkrementowana.przykladowaZmienna += 5;
	}
}
public class cw3str97 {
	public static void main(String [] args){	
		PrzykladowaKlasa przyklad1 = new PrzykladowaKlasa();
		PrzykladowaKlasa przyklad2 = new PrzykladowaKlasa();
		przyklad1.przykladowaZmienna = 1.2f;
		System.out.println(przyklad1.przykladowaZmienna);
		//System.out.println(przyklad2.przykladowaZmienna);
		przyklad2.incr(przyklad1);
		System.out.println(przyklad1.przykladowaZmienna);
		//System.out.println(przyklad2.przykladowaZmienna);
	}
}
