
import java.util.Scanner;

public class Panagram {
	
	static void isPanagram(String s) {
		String t = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		int count = 0;
		for(int i = 0; i < t.length(); i++) {
			if(s.indexOf(t.charAt(i)) >= 0) {
				count++;
			}
			else {
				break;
			}	
		}
		if(count == 26) {
			System.out.println("Given String is Panagram");
		}
		else {
			System.out.println("Given String is Not Panagram");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		
		isPanagram(s);

	}

}
