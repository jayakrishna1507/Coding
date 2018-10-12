
import java.util.*;

public class StackImpl {
	public interface Operator {

		public int eval(int a,int b);
	}

public static	Stack<Integer> stack = new Stack<Integer>();
	//Stack<Integer> stack=new Stack<Integer>();
public static	Stack <Integer>minStack =new Stack<Integer>();
	
	public static void push(int x){
		stack.push(x);
		if(minStack.isEmpty() || x<=minStack.peek()){
			minStack.push(x);
		}
	}
	
	public void pop(){
		stack.pop();
	}
	
	public int top(){
		return stack.peek();
	}
	
	public  int getMin(){
		return minStack.peek();
	}
	public static void main(String[] args){
		
		StackImpl st=new StackImpl();
	
	int value=	st.getMin();
	System.out.println(value);
	}

	public StackImpl() {
		System.out.println("I start from here");
		int[] a= {5,1,3,7,6};
		
		for (int i:a){
			push(i);
		}
		// TODO Auto-generated constructor stub
	}
	
	//reverse polish notation-start
/*private static final Set<String> operators= new HashSet<>(Arrays.asList("+","-","*","/"));
//	private static final String[] operators={"","","",""};

private int eval(int x, int y, String operator) {
	// TODO Auto-generated method stub
	
	switch(operator){
	
	case "+": return x + y;
	case "-": return x - y;
	case "*": return x * y;
	default:  return x /y;
	
	}
}*/
// THE OPERATOR STATEMENT AND EVAL METHOD CAN BE DONE IN A SINGLE METHOD

private static final Map<String,Operator> operators=new HashMap<String,Operator>(){/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

{
	put("+", new Operator(){
		public int eval(int x,int y){return x+y;}
	});
	put("-",new Operator(){
		
		public int eval(int x,int y){return x-y;}
	});
	
put("*",new Operator(){
		
		public int eval(int x,int y){return x*y;}
	});
	
put("/",new Operator(){
	
	public int eval(int x,int y){return x/y;}
});

	
}};

public int evalRPN(String[] tokens){
	
	Stack<Integer> stack=new Stack<Integer>();
	
	for(String token:tokens){
		if(operators.containsKey(token)){
			int y=stack.pop();
			int x=stack.pop();
			//stack.push(eval(x,y,token);
			operators.get(token).eval(x, y);
		}else{
			stack.push(Integer.parseInt(token));
		}
	}
	
	return stack.pop();
	
	
}

//end of reverse poly notation	

//valid paranthesis-problem 3

private static final Map<Character,Character> brackets= new HashMap<Character,Character>(){/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

{
	put('{','}');
	put('(',')');
	put('[',']');
	
	
	
}};

public boolean ValidParanthesis(String S){
	
	Stack<Character> newStack= new Stack<Character>();
	for (char ch:S.toCharArray()){
		
		if(brackets.containsKey(ch)){
			newStack.push(ch);
		}else if(newStack.isEmpty()|| brackets.get(newStack.pop())!=ch){
			return false;
		}
		
	}
	return stack.isEmpty();





}
}




