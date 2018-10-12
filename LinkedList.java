
//import java.util.LinkedList;




//this is a user defined linked list class 

public class LinkedList {
	
	static Node head;
	//static int data;
	static class Node{
		 
		  int data;
		//public static int data;
		Node next;
		
		public Node(int d){
			data=d;
			next=null;
			
		}
		
		public Node(){
			
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		LinkedList ListNode1= new LinkedList();
		ListNode1.head=new Node(1);
		//System.out.println(ListNode1.head.data);
		Node second= new Node(3);
	//	System.out.println(second.data);
	//	System.out.println(ListNode1.head.data);
		Node third= new Node(5);
	//	System.out.println(third.data);
	//	System.out.println(ListNode1.head.data);
	//	System.out.println(second.data);
	//	System.out.println(third.data);
		
		ListNode1.head.next=second;
		second.next=third;
		
		
		
		
	//	getElements(ListNode1);
		LinkedList ListNode2= new LinkedList();
		ListNode2.head=new Node(2);
		
		Node fourth= new Node(4);
		Node fifth= new Node(6);
		
		ListNode2.head.next=fourth;
		fourth.next=fifth;
		
		
//		getElements(ListNode2);
		
//LinkedList output=	mergeTwoLists(ListNode1,ListNode2);
//getElements(output);

		//printReverse(ListNode1);
		printKthToLast(ListNode1.head,2);
	}


public static void getElements(LinkedList l1){
	
	Node n=l1.head;
	
	while(n!=null){
		System.out.println(n.data+" ");
		n=n.next;
		
	}
	
}
	private static LinkedList mergeTwoLists(LinkedList listNode1, LinkedList listNode2) {
		// TODO Auto-generated method stub
		LinkedList dummyHead= new LinkedList();
		 dummyHead.head=new Node(0);
		LinkedList p=dummyHead;
		
		while(listNode1.head != null && listNode2.head!=null){
			if (listNode1.head.data <  listNode2.head.data){
			//p.head=	new Node(listNode1.head.data);
			//	p.head.next=new Node(listNode1.head.data);
			//listNode1.head	=listNode1.head.next;
		p.head.next=new Node(listNode1.head.data);
		//p.head.next=p.head;
		listNode1.head	=listNode1.head.next;
		//		newNode.next=head;
		//		head=newNode;
				
			}else
			{
			//	p.head=	new Node(listNode2.head.data);
			//	p.head.next=new Node(listNode2.head.data);
			//	listNode2.head	=listNode2.head.next;
				p.head.next=new Node(listNode2.head.data);
				//p.head.next=p.head;
				listNode2.head	=listNode2.head.next;
			}
			
			
			p.head.next=p.head;
			
		}
		
		if(listNode1.head !=null) p.head.next=listNode1.head; //debug the code for these 2 lines
		if(listNode2.head !=null) p.head.next=listNode2.head;
		
		return dummyHead;
	}


private static Node addNode(int data){
	
	Node newNode= new Node(data);
	return newNode;
	
	
}

public static void printReverse(LinkedList listNode1){
	
	if(head==null){
		System.out.println("null");
	}else{
		printReverseRecursive(listNode1.head);
	}
	
}


private static void printReverseRecursive(Node head2) {
	// TODO Auto-generated method stub
	
	if(head2 == null){
		return;
	}
	
	printReverseRecursive(head2.next);
	System.out.println(head2.data);
}

public static int printKthToLast(Node listNode1,int k){
	//int index=0;
	if(listNode1 ==null){
		return 0;
	}
	//System.out.println(index);
int	 index=printKthToLast(listNode1.next,k)+1;
	System.out.println(index);
	if(index ==k){
		
		System.out.println(k+ "th to last node is"+ listNode1.data);
	}
	
	return index;
	
}

}
