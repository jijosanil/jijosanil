package javaIO;

import java.util.Map;

public class Main {
	private static Locations locations = new Locations();
	public static void main(String[] args) {
		System.out.println(locations.get(1).getDescription());
		for (String nm : locations.get(1).getExits().keySet()) {
			System.out.println(	nm  +"  "+locations.get(1).getExits().get(nm));
		}
	}

}
