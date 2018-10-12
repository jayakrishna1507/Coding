import java.util.HashMap;
import java.util.Map;
//in hash map when we try to add elements with same key then it overides the present key and value with current
//key and value
public class TwoSum2 {

	private Map<Integer,Integer> hm=new HashMap<>();
	
	private void add(int input){
		
	int count=	(hm.containsKey(input))? hm.get(input):1;
		hm.put(input, count+1);
	
		
	}
	
	private boolean find(int val){
		
		for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
			int num=entry.getKey();
			
			//System.out.println("key is "+	entry.getKey()+ "value is "+entry.getValue());
			int y=val-num;
			
			if(y==num){
				if(entry.getValue()>2) return true;
				
			}else if(hm.containsKey(y)){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main (String[] args){
		
		TwoSum2 tm=new TwoSum2();
		tm.add(2);
		tm.add(3);
		tm.add(2);
		tm.add(5);
		
		System.out.println(tm.find(12));
	}
}
