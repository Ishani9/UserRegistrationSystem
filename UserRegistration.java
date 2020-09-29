
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
		
		//UC3
		String email = "abc.xyz@bl.co.in";
		patternMatcher.validateEmail(email);
		
		//UC4
		String phno = "91 1110002223";
		patternMatcher.validatePhone(phno);
		
		//UC5
		String password = "IIISSSHHH";
		patternMatcher.validatePassword(password);
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
	
	
	//USE CASE 3------
	public void validateEmail(String s) {
		String regex = "^(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(s);
		if(matcher.find()) {
			System.out.println("EMAIL IS VALID");
		}
		else {
		System.out.println("EMAIL IS INVALID");
		}
	}
	//USE CASE 3 COMPLETE------
	
	//USE CASE 4------
		public void validatePhone(String s) {
			String regex = "^([0-9]{1,3}[ ][0-9]{10})$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher= pattern.matcher(s);
			if(matcher.find()) {
				System.out.println("PHONE NUMBER IS VALID");
			}
			else {
				System.out.println("PHONE NUMBER IS INVALID");
			}
		}
		//USE CASE 4 COMPLETE------
		
		//USE CASE 5------
		public void validatePassword(String s) {
			String regex = "^([A-Za-z!@#$%^&*]{8,})$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher= pattern.matcher(s);
			if(matcher.find()) {
				System.out.println("PASSWORD IS VALID");
				}
			else {
				System.out.println("PASSWORD IS INVALID");
				}
			}
		//USE CASE 5 COMPLETE------
	
}
