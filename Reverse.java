
public class Reverse {

	public static int reverse(int x){
		
		int ret=0;
		//to handle overflow and underflow
		if(Math.abs(ret)>214748364){
			return 0;
		}
		
		while(x!=0){
			
			ret=ret*10+x/10;
			x/=10;
		}
		
		return ret;
	}
}
