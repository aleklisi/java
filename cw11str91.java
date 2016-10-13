/*
 * @autor Aleksander Lisicecki
 * @version 1.0 i ostatnia :p
 */
class WszystkieKoloryTeczy{
	int liczbaCalkowitaKolorow;
	void zmienOdcien(int nowyOdcien)
	{
		this.liczbaCalkowitaKolorow = nowyOdcien;
	}
}
public class cw11str91 {
	public static void main(String [] args){	
		WszystkieKoloryTeczy paleta = new WszystkieKoloryTeczy();
		System.out.println(paleta.liczbaCalkowitaKolorow);
		paleta.liczbaCalkowitaKolorow = 1;
		System.out.println(paleta.liczbaCalkowitaKolorow);
		paleta.zmienOdcien(2);
		System.out.println(paleta.liczbaCalkowitaKolorow);
	}
}
