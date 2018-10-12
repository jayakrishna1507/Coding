
public class HayStack {
	
	public static int strstr(String s,String m){
		for (int i=0; ;i++){
			for(int j=0; ;j++){
				if(j==s.length())return i;
				if(i+j==m.length())return -1;
				if(s.charAt(j) != m.charAt(i+j)) break;
			}
			
		}
	}
	
	public static void main(String[] args){
		int output= strstr("issi","mississippi");
		System.out.println(output);
	}
}
