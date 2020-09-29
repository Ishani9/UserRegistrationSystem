import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		String name1 = "Ish";
		patternMatcher.validateName(name1);
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
	
	
}
