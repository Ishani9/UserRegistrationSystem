
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration{
	
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
		
		//UC8
		String password = "iiI2@sshaaa";	
		patternMatcher.validatePassword(password);
		
		//UC9 
		String[] multipleEmail;
		multipleEmail =  new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
				"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",
				"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com",
				"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
		for(int i=0; i< multipleEmail.length; i++) {
			patternMatcher.validateEmail(multipleEmail[i]);
		}
	}
			
	
	public void matchpattern(String regex, String input, String key) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(input);
		if(matcher.find()) {
			System.out.println(key + " "+ input + " is :"  +" VALID");
		}
		else {
			System.out.println(key  + " " + input + " is :"  +" INVALID");
		}		
	}
	
	
	//USE CASE 1------
	public void validateName(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";	
		matchpattern( regex,  s,  "NAME ");				
	}
	
	//USE CASE 1 COMPLETE------

	//USE CASE 2------
	public void validateSurname(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";
		matchpattern( regex,  s,  "SURNAME ");

	}
	//USE CASE 2 COMPLETE------
	
	
	//USE CASE 3------
	public void validateEmail(String s) {
		String regex = "^[a-zA-Z0-9]+[-+.]?+[A-Za-z0-9]+[@]+[A-Za-z0-9]+[.][a-z]{2,}+[.]?+([a-z]{2,})?$";
		matchpattern( regex,  s,  "EMAIL ");
	}
	//USE CASE 3 COMPLETE------
	
	
	//USE CASE 4------
		public void validatePhone(String s) {
			String regex = "^([0-9]{1,3}[ ][0-9]{10})$";
			matchpattern( regex,  s,  "PHONE NO. ");
		}
	//USE CASE 4 COMPLETE------
		
		
	//USE CASE 8------
		public void validatePassword(String s) {
			String regex = "^((?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@#$%^&*]{8,})$";
			matchpattern( regex,  s,  "PASSWORD ");
			}
	//USE CASE 8 COMPLETE------
		

}