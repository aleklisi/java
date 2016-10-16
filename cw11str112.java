
public class cw11str112 {
	public static void main(String [] args){	
		int pierwsza = 0x800;
		for (int i = 0; i < 10; i++){
			System.out.println(Integer.toBinaryString(pierwsza));
			pierwsza >>= 1;
		}
	}
}	