package Lambda.lamdaChallenge;

public class Challenge1 {

	public static void main(String[] args) {
		{
			Runnable runnable=() ->{
				String myString = "lets split this into arrays";
				String[] parts = myString.split(" ");
				for(String nm : parts)
					System.out.println(nm);
			};
		}
		//Same thing is done for both , the above using lambda and below 
		//using the anonymous class
		{
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					String myString = "lets split this into arrays";
					String[] parts = myString.split(" ");
					for(String nm : parts)
						System.out.println(nm);
				}
			};
		}


	}


}
