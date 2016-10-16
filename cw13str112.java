
public class cw13str112 {
	public static void main(String [] args){	
		char[] pierwszy = new char[3];
		pierwszy[0] = 'a';
		pierwszy[1] = '1';
		pierwszy[2] = '!';
		for (int i = 0; i < 3; i++){
			System.out.println(pierwszy[i]);
			System.out.println(Integer.toBinaryString(pierwszy[i]));
		}
	}
}
