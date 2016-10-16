
public class cw10str108 {
	public static void main(String [] args){	
		int pierwsza = 0x5555;
		int druga = 0xaaaa;
		System.out.println(Integer.toBinaryString(pierwsza));
		System.out.println(Integer.toBinaryString(druga));
		System.out.println(Integer.toBinaryString(druga^pierwsza));
		System.out.println(Integer.toBinaryString(druga|pierwsza));
		System.out.println(Integer.toBinaryString(druga&pierwsza));
	}
}
