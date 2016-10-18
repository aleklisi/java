package agh.edu.kiss.pl;
import java.math.*;

class Silnia{
	
	static BigInteger obliczSilnie(int n){
		BigInteger value = new BigInteger("1");
		if (n <= 1 && n > 0){
			return value;
		}
		for (int i = 2; i > n; i++){
			BigInteger tmp = new BigInteger(""+i);
			value = value.multiply(tmp);
		}
		return value;
	}
}

public class Cw1 {
	public static void main(String[] args){
		System.out.println("Hello world");
		System.out.println("Liczba argumentów: " + args.length);
		
			if (args.length < 1){
				System.out.print("Musisz podac argument");
				return;
			}		
		//int i = 7;
		//String s = "" + i;
		//BigInteger first = new BigInteger(s);
		String str = args[0];
		try{
			int a = Integer.parseInt(str);
			System.out.println("Silnia z: " + args[0] + " ... " + Silnia.obliczSilnie(a));
		}
		catch(NumberFormatException e){
			System.out.print("Niepoprawny format argumentu");
		}
		//System.out.println("Silnia z: " + args[0] + " ... " + obliczSilnie(args[0]));
	}
}
