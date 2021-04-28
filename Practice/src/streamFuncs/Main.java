package streamFuncs;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Main {
	public static void main(String argsp[]) {
		List<String> someBingos = Arrays.asList("C22","C23",
				"B33","B87","D53","A23","A45","N11","I33");
		
		// Sorting using the anonymous class
//		Collections.sort(someBingos, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareToIgnoreCase(o2);
//			};
//		});
		
		//Sorting Using the lambda expressions
		Collections.sort(someBingos, (s1, s2) -> s1.compareToIgnoreCase(s2));
		
		someBingos.forEach(number -> {
			System.out.println(number);
			});
		
	}

}
