import java.util.*;
class RzucanieMoneta{
	static void rzucMoneta(){
		Random gen = new Random(); 
		if(gen.nextBoolean()){
			System.out.println("Orzel");
		}
		else		{
			System.out.println("Reszka");
		}
	}
}
public class cw7str107 {
	public static void main(String [] args){	
		for (int i = 0; i < 10; i++){
			RzucanieMoneta.rzucMoneta();
		}
	}
}
