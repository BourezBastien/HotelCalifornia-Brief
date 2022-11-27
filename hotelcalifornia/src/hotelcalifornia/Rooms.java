package hotelcalifornia;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Rooms {
	
	public int id, price, category;    
	public String name;    
	public boolean reserved;
	
	private static Map<Integer, Rooms> roomsCollection = new HashMap<Integer, Rooms>();
	
	public Rooms(){};
	
	public Rooms(int id, int category, int price, String name, boolean reserved) {    
	    this.id = id;    
	    this.category = category;
	    this.price = price;
	    this.name = name;
	    this.reserved = reserved;
	} 
	
	public String[] GetAllRoomFromCSV() { 
		
	    String line = "";
	    String splitBy = ",";
	    try {
	      //parsing a CSV file into BufferedReader class constructor  
	      BufferedReader br = new BufferedReader(new FileReader("/home/uranium/eclipse-workspace/hotelcalifornia/src/data.csv"));
	      while ((line = br.readLine()) != null)
	      //returns a Boolean value  
	      {
	        String[] room = line.split(splitBy);
	        //use comma as separator 
	       return room;
	      }
	    }
	    catch(IOException e) {
	      e.printStackTrace();
	    }
		return null;
		
	  }
	
}
