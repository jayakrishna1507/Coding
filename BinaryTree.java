import java.util.Queue;
import java.util.LinkedList;

class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
class BinaryTree 
{
    Node root;
      
    
    public BinaryTree createTree(){
        // Let us construct the BST shown in the above figure
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(20);
         tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right.right=new Node(24);
        tree.root.right.right.right=new Node(28);
        return tree;
  
    }
  public static boolean isValidBST(Node root){
	  
	  return valid(root,null,null);
  }
	private static boolean valid(Node p, Integer low, Integer high) {
	// TODO Auto-generated method stub
		if(p==null) return true;
		
	return (low==null || p.data >low) &&
			(high==null || p.data <high)
			&& valid(p.left,low,p.data)
			&& valid(p.right,p.data,high);
}
	
	private static int depthOfBinarySearchTree(Node root){
		if(root ==null) 
			return 0;
		int a=Math.max(depthOfBinarySearchTree(root.left),depthOfBinarySearchTree(root.right)) + 1;
		System.out.println(a);
		return a;
		
	}
	
	private static int minDepth(Node root){
		if(root ==null)
			return 0;
		if(root.left==null){
			 System.out.println( minDepth(root.right)+1);
			return 	minDepth(root.right)+1;}
		if(root.right==null) {
			
			return minDepth(root.left)+1;}
		return Math.min(minDepth(root.left), minDepth(root.right))+1;
		
	}
	//preorder traversal
	private static int minDepth2(Node root){
		
		if(root==null) return 0;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		Node rightMost=root;
		int depth=1;
		while(!q.isEmpty()){
			Node node=q.poll();
			
			if(node.left ==null && node.right==null)
				break;
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
			if(node==rightMost){
				depth++;
				rightMost=(node.right!=null) ? node.right:node.left;
			}
		}
		
		return depth;
	}
	//method for finding whether the tree is binary based tree
	public static boolean isBalanced(Node root){
		return maxDepth(root) !=-1;
		
	}
	private static int maxDepth(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		int L=maxDepth(root.left);
		
		if(L==-1)
			return -1;
		int R=maxDepth(root.right);
		if(R==-1)
			return -1;
		return (Math.abs(L-R)<=1)?(Math.max(L, R)+1):-1;
		//return -1;
	}
	
	static int getHeight(Node root){
		
		if (root==null) return -1;
		
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
		
	}
public static Boolean isBalanced2(Node root){
		
		if (root==null) return true;
		System.out.println(root.data);
		System.out.println(getHeight(root.left));
		int heightDiff=getHeight(root.left)-getHeight(root.right);
		
		if (Math.abs(heightDiff)>1){
			return false;
		}else{
			return isBalanced2(root.left)&&isBalanced(root.right);
		}
		
		
		//return false;
	}
	
	
	public static Node sortedArrayToBST(int[] num){
		return sortedArrayToBST(num,0,num.length-1);
	}
	private static Node sortedArrayToBST(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end )return null;
		int mid=(start+end)/2;
		Node node= new Node(arr[mid]);
		node.left=sortedArrayToBST(arr,start,mid-1);
		node.right=sortedArrayToBST(arr,mid+1,end);
		return node;
	}
	
	
	
	
	
	public static void main(String[] args){
		
		
		BinaryTree tree = new BinaryTree();
		 tree=tree.createTree();
		// System.out.println( tree.root.left.right.right.data);
	//	boolean output= 	isValidBST(tree.root);
		 
		// System.out.println(output);
		 
	//	 int output=depthOfBinarySearchTree(tree.root);
	//	 System.out.println(output);
		 
	//	 int output=minDepth2(tree.root);
	//	 System.out.println(output);
		 
		 boolean output=isBalanced2(tree.root);
		 System.out.println(output);
//		 int[] num={9,12,14,17,19,23,50,54,67,72,76};
	//	 Node output=sortedArrayToBST(num);
		// System.out.println(output.data);
	}
	
}