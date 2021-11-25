package training;
public class StringFunctions {
	
	public static void main(String[] args)
	{
		String first="Welcome Dinesh";
		String second="Dinesh";
		
//string class methods and its functions
		System.out.println("Lower Case : "+first.toLowerCase());
		
		System.out.println("Upper Case : "+first.toUpperCase());
		
		System.out.println("Length : "+first.length());
		
		System.out.println("Without Trim : "+second);
		
		System.out.println("With Trim : "+second.trim());
		
		System.out.println("Char At(6) : "+first.charAt(6));
		
		System.out.println("SubString : "+first.substring(1,5));
		
		System.out.println("Replace : "+first.replace("W","T"));
		
		System.out.println("CompareTo : "+second.compareTo(first));
		
		System.out.println("CompareToIgnoreCase : "+second.compareToIgnoreCase(first));
		
		System.out.println("concat : "+second.concat(" DINESH"));
		
		System.out.println("contentEquals 1 : "+second.contentEquals("dinesh"));
		
		System.out.println("contentEquals 2 : "+second.contentEquals("Dinesh"));
	}
}