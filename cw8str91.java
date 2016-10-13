/*
 * @autor Aleksander Lisicecki
 * @version 1.0 i ostatnia :p
 */
class StaticTest{
	static int i = 47; //47 jak w ksazce ale 1 tez mogloby byc 
}
class StaticFun{
	static void incr(){
		StaticTest.i++;
	}
}
public class cw8str91 {
	public static void main(String [] args){
		StaticTest pierwsza = new StaticTest();
		System.out.println(pierwsza.i);
		StaticFun.incr();
		System.out.println(pierwsza.i);
		StaticFun.incr();
		StaticFun.incr();
		System.out.println(pierwsza.i);
		StaticTest druga = new StaticTest();		
		System.out.println(pierwsza.i);
		System.out.println(druga.i);
		StaticFun.incr();
		System.out.println(pierwsza.i);
		System.out.println(druga.i);
		}
}
