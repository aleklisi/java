/*
 * @autor Aleksander Lisicecki
 * @version 1.1 i ostatnia :p
 */
public class cw10str91 {
	public static void main(String [] args){	
		if ( args.length != 3 ) {
			throw new RuntimeException("zla liczba argumentow"); 
		}
		else{
			for (int i = 0; (i < 3); i++){
				System.out.println(args[i]);
			}
		}	
	}
}