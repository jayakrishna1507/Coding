import java.util.ArrayList;
import java.util.List;

public class Matrix {
	
	public static void main(String[] args){
		
		int[][] matrix=new int[3][3];
		//matrix[0][1]=1;//and so on..
		
		//int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		matrix[0][0]=1;  
		matrix[0][1]=2;  
		matrix[0][2]=3;  
		matrix[1][0]=4;  
		matrix[1][1]=5;  
		matrix[1][2]=6;  
		matrix[2][0]=7;  
		matrix[2][1]=8;  
		matrix[2][2]=9;  
		
	}
public static List<Integer> spiralOrder(int[] matrix){
	
	List<Integer> elements=new ArrayList<>();
	if(matrix.length==0) return elements;
	
	int m=matrix.length,n=matrix.length;
	int row=0,col=-1;
	while(true){
		
		for(int i=0;i<n;i++){
			
			//elements.add(matrix[row][++col]);
		}
	}
	
	
}
	
}
