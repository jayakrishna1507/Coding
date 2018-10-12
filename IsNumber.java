
public class IsNumber {
	
	public static boolean isNumber(String s){
		
		int i=0,n=s.length();
		while(i<n && Character.isWhitespace(s.charAt(i))) i++;
		
		if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-' )) i++;
		
		boolean isNumeric=false;
		
		while(i<n && Character.isDigit(s.charAt(i))){
			i++;
			isNumeric=true;
			
		}
		
		if(i<n && s.charAt(i) =='.'){
			i++;
		
		
		while(i<n && Character.isDigit(s.charAt(i))){
			i++;
			isNumeric=true;
			
		}
	}
		
		// this block of code is for the exponential
		if(isNumeric && i<n && s.charAt(i)=='e'){
			i++;
			isNumeric=false;
		if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-'))i++;	
			while(i<n && Character.isDigit(s.charAt(i))){
				i++;
				isNumeric=true;
				
			}
			
		}
		
		while(i<n && Character.isWhitespace(s.charAt(i))) i++;
		return isNumeric && i==n;
		
	}
	
	public static void main(String[] args){
		
		boolean output=isNumber("123.45");
		System.out.println(output);
	}
}
