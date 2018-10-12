import java.util.Arrays;

public class SubString {
	//2n steps
	public static int lenghtOfLongestSubstring(String s){
		
		boolean[] exist=new boolean[256];
		
		int i=0,maxLen=0;
		
		for(int j=0;j<s.length();j++){
			
			while(exist[s.charAt(j)]){
				exist[s.charAt(i)]=false;
				i++;
			}
			
			exist[s.charAt(j)]=true;
			maxLen=Math.max(j-i+1, maxLen);
			
		}
		
		return maxLen;
	}
	//n steps
	public static int lenghtOfLongestSubstring2(String s){
		int[] charMap=new int[256];
		Arrays.fill(charMap, -1);
		
		int i=0,maxLen=0;
		
		for(int j=0;j<s.length();j++){
			if(charMap[s.charAt(j)] >=i){
			i=charMap[s.charAt(j)]+1;
			
		}
		
		charMap[s.charAt(j)]=j;
		maxLen=Math.max(j-i+1, maxLen);
		}
		return maxLen;
	}
	//with 2 distinct characters dint get it
	public static int lengthOfLongestSubSstringTwoDistinct(String s){
		
		int i=0,j=-1,maxLen=0;
		
		for(int k=1;k<s.length();k++){
			if(s.charAt(k)==s.charAt(k-1))continue;
			if(j>=0 && s.charAt(j)!=s.charAt(k)){
				maxLen=Math.max(k-i, maxLen);
				i=j+1;
			}
			j=k-1;
		}
		
		return Math.max(s.length()-i, maxLen);
	}
	
public static int lengthOfLongestSubSstringTwoDistinct2(String s){
	
	int[] count=new int[256];
	
	int i=0,numDistinct=0,maxLen=0;
	
	for(int j=0;j<s.length();j++){
		
		if(count[s.charAt(j)] ==0 )numDistinct++;
		count[s.charAt(j)]++;
		while(numDistinct >2){
			count[s.charAt(i)]--;
			if(count[s.charAt(i)] ==0 )numDistinct--;
			i++;
		}
		
		maxLen=Math.max(j-i+1, maxLen);
	}
	
		return maxLen;
	}
	
	public static void main(String[] args){
		int output=lengthOfLongestSubSstringTwoDistinct2("eceba");
		System.out.println(output);
		
	}
}
