
class Logiczna{
	static void testLogiString(String slowo1, String slowo2){
		System.out.println(("=="));
		System.out.println((slowo1 == slowo2));
		System.out.println(("!="));
		System.out.println((slowo1 != slowo2));
		System.out.println(("equals"));
		System.out.println((slowo1.equals(slowo2)));
		
	}
}
public class cw14str126 {
	public static void main(String [] args){	
		String fooString1 = new String("foo");
		String fooString2 = new String("foo");
		Logiczna.testLogiString(fooString1,fooString2);
		String fooString3 = new String("food");
		String fooString4 = new String("foo");
		Logiczna.testLogiString(fooString3,fooString4);
	}
}
