
public class ClimbStairs {

	//This method is used for fibonacci and climb stairs
	
	public static int climbStairs(int n){
		
		int p=1,q=1;
		
		for(int i=2;i<n;i++){
			q+=p;
			int temp=q;
			
			p=temp;
			
		}
		
		return q;
	}
	
	public static void main(String[] args){
		
		int output=climbStairs(4);
		System.out.println(output);
	}
	
}
