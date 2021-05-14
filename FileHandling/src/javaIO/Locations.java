package javaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Locations implements Map<Integer, Location> {

	public static void main(String args[]) {
		FileWriter locfile = null;
		try {
			locfile = new FileWriter("locations.txt");
			for(Location loc : locations.values()) {
				locfile.write(loc.getLocationID()+"  "+loc.getDescription()+",\n");
			}
			
		}catch (IOException e) {
			System.out.println("Some error has Occured");
			e.printStackTrace();
		}finally {
			System.out.println("In the Finally Block");
			try {
				if (locfile != null)
				{
					System.out.println("closing the File object");
					locfile.close();
				}
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
		
		
	}
	
	private static Map<Integer , Location> locations = new HashMap<Integer, Location>();
	static {
		//this is the static initialization Block to make sure that the data is initialized only once
		Map<String, Integer> tempexit = new HashMap<String, Integer>();
		locations.put(0, new Location(0, "Infront of Computer learning Java", tempexit));
		
		tempexit = new HashMap<String, Integer>();
		tempexit.put("J", 1);
		tempexit.put("I", 2);
		tempexit.put("J", 3);
		tempexit.put("O", 4);
		locations.put(1, new Location(1, "This is My Name ", tempexit));
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
