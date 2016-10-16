class Dog{
	String name;
	String says;
}
public class cw6str103 {
	public static void main(String [] args){	
		Dog spot = new Dog();
		Dog scuffy = new Dog();
		spot.name = "Spot";
		scuffy.name = "Scuffy";
		spot.says = "Hau";
		scuffy.says = "Wrrr";
		Dog nowy = spot;
		if (spot == nowy){
			System.out.println("spot == nowy");
		}
		else{
			System.out.println("spot != nowy");
		}		
		if (scuffy == nowy){
			System.out.println("scuffy == nowy");
		}
		else{
			System.out.println("scuffy != nowy");
		}		
		if (spot == scuffy){
			System.out.println("spot == scuffy");
		}
		else{
			System.out.println("spot != scuffy");
		}
	}
}
