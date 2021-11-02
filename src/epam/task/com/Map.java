package epam.task.com;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		  HashMap<String, Integer> map = new HashMap<>();
		  
	        map.put("Anvi", 40);
	        map.put("Manju", 30);
	        map.put("Renu", 10);
	        map.put("Shruthi", 20);
	 
	   
	        System.out.println("Size of map is "+ map.size());

	        System.out.println(map);
	}

}
