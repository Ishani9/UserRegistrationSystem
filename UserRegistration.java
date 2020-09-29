
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		
		//UC1
		String name1 = "Ishani";
		patternMatcher.validateName(name1);
		
		//UC2
		String surname1 = "Mhatre";
		patternMatcher.validateSurname(surname1);
	}
	
	//USE CASE 1------
	public void validateName(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(s);
		if(matcher.find()) {
			System.out.println("NAME VALID");
		}
		else {
		System.out.println("NAME INVALID");
		}
	}
	//USE CASE 1 COMPLETE------
	
	//USE CASE 2------
		public void validateSurname(String s) {
			String regex = "(^[A-Z]{1}[a-z]{2,}$)";	
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher= pattern.matcher(s);
			if(matcher.find()) {
				System.out.println("SURNAME VALID");
			}
			else {
			System.out.println("SURNAME INVALID");
			}
		}
		//USE CASE 2 COMPLETE------
	
	
}

