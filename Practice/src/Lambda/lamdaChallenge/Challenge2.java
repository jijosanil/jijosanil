package Lambda.lamdaChallenge;

import java.util.function.Function;
import java.util.function.Supplier;

public class Challenge2 {
	public static void main(String[] args) {
		Function<String, String> func = (String s) -> {
			StringBuilder ret = new StringBuilder();
			for( int i=0 ;i<s.length();i++) {
			if(i%2==0) ret.append(s.charAt(i));
			}
			return ret.toString();
		} ;
		System.out.println(	everySecondChar(func,"JIJO SANIL KUMAR"));
		
		Supplier<String> ilovejava = ()-> "i Love Java";
		String result = ilovejava.get();
		System.out.println(result);
	}
	
	public static String everySecondChar(Function<String,String> func,String source) {
			
		return func.apply(source);
	}
}
