/*
 * @autor Aleksander Lisicecki
 * @version 1.0 i ostatnia :p
 * ofc chodzi o kod z cw 4 zeby zadanie mialo sens ;)
 */
class TylkoDane{
	int i;
	double d;
	boolean b;
}
public class cw5str91 {
	public static void main(String [] args){
		TylkoDane przykladowyObiekt = new TylkoDane();
		przykladowyObiekt.i = 1;
		przykladowyObiekt.d = 123.456;
		przykladowyObiekt.b = true;
		System.out.print("wartosc przykladowyObiekt.i to: ");
		System.out.println(przykladowyObiekt.i);
		System.out.print("wartosc przykladowyObiekt.d to: ");
		System.out.println(przykladowyObiekt.d);
		System.out.print("wartosc przykladowyObiekt.b to: ");
		System.out.println(przykladowyObiekt.b);
	}
}
