
public class ReverseAWord {
	
	public static String reverseWords(String s){
		
		StringBuilder sb= new StringBuilder();
		int j=s.length();
		
		for(int i=s.length()-1;i>=0;i--){
			
			if(s.charAt(i)== ' '){
				
				j=i;
			}else if(i==0 || s.charAt(i-1) == ' ' ){
				if(sb.length()!=0){
					sb.append(' ');
				}
				
				sb.append(s.substring(i,j));
			}
		}
		
		
		return sb.toString();
	}
	
	public static String reverseWords2(char[] s){
		 reverse(s,0,s.length);
	for(int i=0, j=0;j<=s.length;j++){
		if(s[j]==' '){
			reverse(s,i,j);
			i=j+1;
		}
		
	}
		
		return s.toString();
	}

	private static void reverse(char[] s, int begin, int end) {
		// TODO Auto-generated method stub
		for(int i=0;i<(end-begin)/2;i++){
			char temp=s[begin+i];
			s[begin+i]=s[end-i-1];
			s[end-i-1]=temp;
		}
		
	}

	public static void main(String[] args){
		String s="The Sky is blue";
		String output=reverseWords(s);
		System.out.println(output);
		String output2=reverseWords2(s.toCharArray());
	}
}
