/*
 * @autor Aleksander Lisicecki
 * @version 1.0 i ostatnia :p
 */
class StaticTest{
	static int i = 47; // 47 bo tak bylo w ksiazce, mogal byc kazda inna roizsadna liczba
}
class StaticFun{
	static void incr(){
		StaticTest.i++;
	}
}
public class cw7str91 {
	public static void main(String [] args){
		System.out.println(StaticTest.i);
		StaticFun.incr();
		System.out.println(StaticTest.i);
	}
}
