package cw1str90;
/*
 * @autor Aleksander Lisicecki
 * @version 1.0 i ostatnia :p
 */
class PrzykladowaKlasa{
	int przykladowyInt;
	char przykladowyChar;
}
public class cw1str90 {
	public static void main(String [] args){
		PrzykladowaKlasa testWypelnien = new PrzykladowaKlasa();
		System.out.print("testowany niezainicjalizowany int ma wartosc: ");
		System.out.println(testWypelnien.przykladowyInt);
		System.out.print("testowany niezainicjalizowany char ma watosc: ");
		System.out.println(testWypelnien.przykladowyChar);
	}
}
