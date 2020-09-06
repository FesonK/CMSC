import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String check = ("Are you able to connect with the internet? (yes or no)");
		
		System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work.");
		System.out.println("First step: rebbot your computer");
		System.out.println(check);
		String userinput = scanner.next();
		question(userinput);
		
		System.out.println("Second step: reboot your router");
		System.out.println(check);
		userinput = scanner.next();
		question(userinput);
		
		System.out.println("Third Step: make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.println(check);
		userinput = scanner.next();
		question(userinput);
		
		System.out.println("Fourth Step: Move the computer closer to the router and try to connect");
		System.out.println(check);
		userinput = scanner.next();
		question(userinput);
	
		System.out.println("Please contact your ISP");
	
	
	}

	private static void question(String response) {
		if (response.equals("yes")) {
			System.out.println("Congratulations!! your internet is back");
			System.exit(0);
		}
	}
}


