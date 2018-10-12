import java.util.HashSet;
import java.util.Set;

//find single element of the duplicates
public class BitManipulation {
	
	public int singleNumber(int[] A){
		
		Set <Integer> set =new HashSet<Integer>();
		for(int a:A){
			if(set.contains(a)){
				set.remove(a);
			}else{
				set.add(a);
			}
		}
		
		
		return set.iterator().next();
	}
	
	//finding single element of the triplicates
	
	public int singleNumber(int A[],int n){
		
int ones=0,twos=0,threes=0;

for(int i=0;i<n;i++){
	
	twos |= ones & A[i];
	ones ^=A[i];
	threes=ones & twos;
	ones &= ~threes;
	twos &= ~threes;
	
}
		return ones;
	}
	
	public static void main(String[] args){
		
		BitManipulation bm= new BitManipulation();
		int A[]={10,20,30,10,20,80,30,10,20,30};
		int len=A.length;
		int output=bm.singleNumber(A,len);
		System.out.println(output);
	}

}
