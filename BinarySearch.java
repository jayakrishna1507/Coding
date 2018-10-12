//question 48-50
public class BinarySearch {

//binary search
	public static int searchInt(int[] A,int target ){
		
		int L=0, R=A.length-1;
		while(L<R){
			//dividing into 2 equal parts
			int M=(L+R)/2;
			if(A[M]<target){
				L=M+1;
			}
			
			else{
				R=M;
			}
		}
		
		return (A[L]<target )? L+1:L;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={3,5,7,9,11};
		int []b={4,5,6,2,3};
	int value=	searchInt(a,5);
	int minelementindex=findMin(b);
	System.out.println(value);
	System.out.println(minelementindex);
	}


	private static int findMin(int[] b) {
		// TODO Auto-generated method stub
		
		int L=0,R=b.length-1;
		
		while(L<R && b[L] >= b[R]){
			int M=(L+R)/2;
			if (b[M]>b[R]){
				L=M+1;
			}else if(b[M]>b[R]){
				R=M;
			}else{//b[L]==b[R]==b[m]
				L=L+1;}
			}
		
		
		return b[L];
	}

}
