class Predkosciomierz{
	static double obliczaniePredkosci(double droga, double czas){
		double predkosc = droga / czas;
		return predkosc;
	}
}
public class cw4str99 {
	public static void main(String [] args){	
		double przykladowaDroga = 1; //mozna  1 zamienic na args[0] a 2 na args[1] ;)
		double przykadowyCzas = 2;
		System.out.println(Predkosciomierz.obliczaniePredkosci(przykladowaDroga,przykadowyCzas));
	}
}
