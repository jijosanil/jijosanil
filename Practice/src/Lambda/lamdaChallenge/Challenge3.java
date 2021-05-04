package Lambda.lamdaChallenge;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {

	public static void main(String[] args) {
		List<String> topNames = Arrays.asList("amelia","olivia","emily",
				"isla","ava","oliver","jack","charlie","harry","jacob");
		topNames.stream()
		.map(s-> (s.substring(0, 1).toUpperCase()+s.substring(1)) )
		.sorted(String::compareTo)
		.forEach(System.out::println);
		System.out.println("---------------------------------------");
		long intf = topNames.stream()
		.map(s-> (s.substring(0, 1).toUpperCase()+s.substring(1)) )
		.peek(s->System.out.println(s))
		.filter(s-> s.startsWith("A"))
		.count();
		System.out.println(intf);

	}

}
