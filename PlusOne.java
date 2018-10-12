import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	
	public static void  plusOne(List<Integer> digits){
		
		for(int i=digits.size()-1;i>=0;i--){
			int digit=digits.get(i);
			if(digit<9){
				digits.set(i,digit+1);
				return;
			}else{
				digits.set(i,0);
			}
		}
		digits.add(0);
		digits.set(0,1);
		//return 0;
		
	}
	
	public static void main(String[] args){
		List<Integer>ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(9);
		ls.add(9);
		plusOne(ls);
	}

}
