import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	// if the input array is not sorted
	public static int[] twoSum(int[] numbers,int target){
		
	Map<Integer,Integer> hm= new HashMap<>();
	
	for(int i=0;i<numbers.length;i++){
		int x= numbers[i];
		if(hm.containsKey(target-x)){
			
			return new int[]{hm.get(target-x) +1,i+1};
		}
		hm.put(x,i);
	}
	
throw new IllegalArgumentException("no two sum solution");	
	

	}
	// method fot the sorted input array
	public static int[] twoSum2(int[] numbers,int target){
		
		for(int i=0;i<numbers.length;i++){
			
			int j=bsearch(numbers,target-numbers[i],i);
			if(j!=1){
				return new int[] {i+1,j+1};
			}
		}
		
		throw new IllegalArgumentException("no two sum solution");
	}
	//method for binary search
	public static int bsearch(int[] A,int key,int start){
		
		int L=start, R=A.length-1;
		
		while(L<R){
			int M=(L+R)/2;
			
			if (A[M]<key) {
				L=M+1;
				
			}else{
				R=M;
			}
			
		}
		
		return (L == R && A[L] ==key) ? L:-1;
	}
	
	public static void main(String[] args){
		
		int[] numbers={1,2,3,4,5};
		int target=6;
		
		int[] output=twoSum(numbers,target);
		
		System.out.println(output[0] +output[1] );
	}

}
