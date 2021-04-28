package streamFuncs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

public class Main {
	public static void main(String argsp[]) {
		List<String> someBingos = Arrays.asList("C22","C23",
				"B33","B87","D53","A23","A45","A77","A88","N11","I33");
		List<String> ABingos = new ArrayList<String>();
		// Sorting using the anonymous class
//		Collections.sort(someBingos, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareToIgnoreCase(o2);
//			};
//		});
		
//		someBingos.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//	
//				return o1.compareToIgnoreCase(o2);
//			}
//			
//		});
		
		//Filter
		someBingos.forEach(s1 -> {
			if (s1.startsWith("A")) {
				ABingos.add(s1);
			}
		});
//		//Sorting Using the lambda expressions
//		Collections.sort(someBingos, (s1, s2) -> s1.compareToIgnoreCase(s2));

//		ABingos.sort((s1,s2)-> s1.compareToIgnoreCase(s2));
//		ABingos.forEach(number -> {
//			System.out.println(number);
//			});
		
		
		someBingos
		.stream()
		.map(String::toUpperCase)
		.filter(s1 -> s1.startsWith("A"))
		.sorted()
		.forEach(System.out::println)
		;
		
		
		
		
		
		
	}

}
