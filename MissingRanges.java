import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

	public List<String> findMissingRanges(int[] vals,int start,int end){
		List<String> ranges= new ArrayList<String>();
		
		int prev=start-1;
		for(int i=0;i<vals.length;i++){
			
			int curr=(i==vals.length)?end+1:vals[i];
			
			if(curr-prev >=2){
			ranges.add(getRange( start, curr));
			}
		prev=curr;
		}
		
		return ranges;
	}

	private String getRange(int from, int to) {
		// TODO Auto-generated method stub
		
		return(from == to)? String.valueOf(from):from +"->"+ to;
		
		
	}
}
