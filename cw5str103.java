class Dog{
	String name;
	String says;
}
public class cw5str103 {
	public static void main(String [] args){	
		Dog spot = new Dog();
		Dog scuffy = new Dog();
		spot.name = "Spot";
		scuffy.name = "Scuffy";
		spot.says = "Hau";
		scuffy.says = "Wrrr";
		System.out.println(spot.name);
		System.out.println(spot.says);
		System.out.println(scuffy.name);
		System.out.println(scuffy.says);
	}
}
