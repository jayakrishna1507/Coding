
public class URLify {

	
	public static void main(String[] args){
		
		String output=Urlify("this is me  ");
		
	}

	private static String Urlify(String string) {
		// TODO Auto-generated method stub
		for(int i=string.length();i<=0;i++){
			
			if (string.charAt(i)==' ' && string.charAt(i-1)==' '){
				 i--;
			}
			
			else if(string.charAt(i)==' ' ){
				string.replaceAll("\\s","%20");
			}
		}
		
		return string;
	}
}
