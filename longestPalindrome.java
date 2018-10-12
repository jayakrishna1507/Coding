
public class longestPalindrome {
	//dint get the logic try it at the end
	public static String longestPalindrome(String s){
		
		
		int start=0,end=0;
		for(int i=0;i<s.length();i++){
		int len1=expandAroundCenter(s,i,i);
		int len2=expandAroundCenter(s,i,i+1);
		int len=Math.max(len1, len2);
		if(len>end-start){
			start=i-(len-1)/2;
			end=i+len/2;
		}
		
		}
		return s.substring(start, end+1);
	}

	private static int expandAroundCenter(String s, int left, int right) {
		// TODO Auto-generated method stub
		int L=left,R=right;
		while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
			L--;
			R++;
		}
		return R-L-1;
	}
	
	public static void main(String[] args){
		String output=longestPalindrome("abacdfgdcaba");
		System.out.println(output);
	}

}
