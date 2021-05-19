package javaIO;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Locations implements Map<Integer, Location> {

	public static void main(String args[]) throws IOException{
			
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
			for (Location location : locations.values()) {
				dos.writeInt(location.getLocationID());
				dos.writeUTF(location.getDescription());
				for(String exits : location.getExits().keySet()) {
					dos.writeUTF(exits);
					dos.writeInt(location.getExits().get(exits));
				}
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

	private static Map<Integer , Location> locations = new HashMap<Integer, Location>();
	static {
		 
		try(BufferedReader br = new BufferedReader(new FileReader("locations_big.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("locations.txt"))){
			
			String input;
			while((input=br.readLine())!=null) {
			String[] data = input.split(",");
			int loc = Integer.parseInt(data[0]);
			String description = data[1];
			System.out.println("Imported Loc"+loc+":"+description);
			Map<String , Integer> tempexits = new HashMap<String, Integer>();
			locations.put(loc, new Location(loc, description, tempexits));
			bw.write(input+"\n");
			}
			
		}catch(IOException e  ){
			e.printStackTrace();
			
		}		
		//Now trying to read the exits
		try(BufferedReader br = new BufferedReader(new FileReader("directions_big.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("directions.txt"))) {
			String input;
			
			while((input=br.readLine())!=null) {
//				int loc = scanner.nextInt();
//				scanner.skip(scanner.delimiter());
//				String direction = scanner.next();
//				scanner.skip(scanner.delimiter());
//				String dest = scanner.nextLine();
//				int destination = Integer.parseInt(dest);
				
				String[] data = input.split(",");
				int loc = Integer.parseInt(data[0]);
				String direction = data[1];
				int destination= Integer.parseInt(data[2]);
				System.out.println(loc+","+direction+" "+destination);
				Location location = locations.get(loc);
				location.addExist(direction, destination);
				bw.write(input+"\n");
			}

		}catch(IOException e) {

		}
		
		
		
		//this is the static initialization Block to make sure that the data is initialized only once
//		 Map<String, Integer> tempExit = new HashMap<String, Integer>();
//	        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));
//
//	        tempExit = new HashMap<String, Integer>();
//	        tempExit.put("W", 2);
//	        tempExit.put("E", 3);
//	        tempExit.put("S", 4);
//	        tempExit.put("N", 5);
//	        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
//
//	        tempExit = new HashMap<String, Integer>();
//	        tempExit.put("N", 5);
//	        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
//
//	        tempExit = new HashMap<String, Integer>();
//	        tempExit.put("W", 1);
//	        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
//
//	        tempExit = new HashMap<String, Integer>();
//	        tempExit.put("N", 1);
//	        tempExit.put("W", 2);
//	        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
//
//	        tempExit = new HashMap<String, Integer>();
//	        tempExit.put("S", 1);
//	        tempExit.put("W", 2);
//	        locations.put(5, new Location(5, "You are in the forest",tempExit));
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		// TODO Auto-generated method stub
		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {
		// TODO Auto-generated method stub
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		// TODO Auto-generated method stub
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		locations.clear();
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {
		// TODO Auto-generated method stub
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}


}
